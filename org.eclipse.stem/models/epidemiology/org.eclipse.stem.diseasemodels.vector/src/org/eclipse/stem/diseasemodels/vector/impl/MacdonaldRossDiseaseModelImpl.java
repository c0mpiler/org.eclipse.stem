package org.eclipse.stem.diseasemodels.vector.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.SEIRLabel;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.vector.Activator;
import org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * This is the textbook Macdonald-Ross vector borne disease model. You can find a description of the model in Anderson & May "Infectious Diseases of Humans", chapter 14.4.
 *  with the addition of a immune stage.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl#getBitingRate <em>Biting Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl#getInfectiousBitingProportionHuman <em>Infectious Biting Proportion Human</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl#getInfectiousBitingProportionVector <em>Infectious Biting Proportion Vector</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl#getRecoveryRate <em>Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl#getIncubationRate <em>Incubation Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl#getVectorIncubationRate <em>Vector Incubation Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl#getImmunityLossRate <em>Immunity Loss Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MacdonaldRossDiseaseModelImpl extends VectorDiseaseModelImpl implements MacdonaldRossDiseaseModel {

	final static double MISSING_DATA = 99999.0;

	/**
	 * The default value of the '{@link #getBitingRate() <em>Biting Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitingRate()
	 * @generated
	 * @ordered
	 */
	protected static final double BITING_RATE_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getBitingRate() <em>Biting Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitingRate()
	 * @generated
	 * @ordered
	 */
	protected double bitingRate = BITING_RATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getInfectiousBitingProportionHuman() <em>Infectious Biting Proportion Human</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfectiousBitingProportionHuman()
	 * @generated
	 * @ordered
	 */
	protected static final double INFECTIOUS_BITING_PROPORTION_HUMAN_EDEFAULT = 0.5;
	/**
	 * The cached value of the '{@link #getInfectiousBitingProportionHuman() <em>Infectious Biting Proportion Human</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfectiousBitingProportionHuman()
	 * @generated
	 * @ordered
	 */
	protected double infectiousBitingProportionHuman = INFECTIOUS_BITING_PROPORTION_HUMAN_EDEFAULT;
	/**
	 * The default value of the '{@link #getInfectiousBitingProportionVector() <em>Infectious Biting Proportion Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfectiousBitingProportionVector()
	 * @generated
	 * @ordered
	 */
	protected static final double INFECTIOUS_BITING_PROPORTION_VECTOR_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getInfectiousBitingProportionVector() <em>Infectious Biting Proportion Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfectiousBitingProportionVector()
	 * @generated
	 * @ordered
	 */
	protected double infectiousBitingProportionVector = INFECTIOUS_BITING_PROPORTION_VECTOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getRecoveryRate() <em>Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RECOVERY_RATE_EDEFAULT = 0.00333;
	/**
	 * The cached value of the '{@link #getRecoveryRate() <em>Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected double recoveryRate = RECOVERY_RATE_EDEFAULT;


	/**
	 * The default value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double INCUBATION_RATE_EDEFAULT = 0.0625;
	/**
	 * The cached value of the '{@link #getIncubationRate() <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected double incubationRate = INCUBATION_RATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getVectorIncubationRate() <em>Vector Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double VECTOR_INCUBATION_RATE_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getVectorIncubationRate() <em>Vector Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIncubationRate()
	 * @generated
	 * @ordered
	 */
	protected double vectorIncubationRate = VECTOR_INCUBATION_RATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getImmunityLossRate() <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected static final double IMMUNITY_LOSS_RATE_EDEFAULT = 0.02;
	/**
	 * The cached value of the '{@link #getImmunityLossRate() <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunityLossRate()
	 * @generated
	 * @ordered
	 */
	protected double immunityLossRate = IMMUNITY_LOSS_RATE_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MacdonaldRossDiseaseModelImpl() {
		super();
	}


	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#createInfector()
	 */
	@Override
	public Infector createInfector() {
		SIInfector retValue = StandardFactory.eINSTANCE.createSIInfector();
		retValue.setDiseaseName(this.getDiseaseName());
		retValue.setPopulationIdentifier(getPopulationIdentifier());
		return retValue;
	} // createInfector

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSEIRLabelValue();
	} // createDiseaseModelLabelValue

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#createDiseaseModelLabel()
	 */
	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSEIRLabel();
	} // createDiseaseModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBitingRate() {
		return bitingRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitingRate(double newBitingRate) {
		bitingRate = newBitingRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInfectiousBitingProportionHuman() {
		return infectiousBitingProportionHuman;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfectiousBitingProportionHuman(double newInfectiousBitingProportionHuman) {
		infectiousBitingProportionHuman = newInfectiousBitingProportionHuman;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInfectiousBitingProportionVector() {
		return infectiousBitingProportionVector;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfectiousBitingProportionVector(double newInfectiousBitingProportionVector) {
		infectiousBitingProportionVector = newInfectiousBitingProportionVector;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRecoveryRate() {
		return recoveryRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryRate(double newRecoveryRate) {
		recoveryRate = newRecoveryRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncubationRate() {
		return incubationRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubationRate(double newIncubationRate) {
		incubationRate = newIncubationRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVectorIncubationRate() {
		return vectorIncubationRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorIncubationRate(double newVectorIncubationRate) {
		vectorIncubationRate = newVectorIncubationRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getImmunityLossRate() {
		return immunityLossRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunityLossRate(double newImmunityLossRate) {
		immunityLossRate = newImmunityLossRate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE:
				return getBitingRate();
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN:
				return getInfectiousBitingProportionHuman();
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR:
				return getInfectiousBitingProportionVector();
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE:
				return getRecoveryRate();
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE:
				return getIncubationRate();
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE:
				return getVectorIncubationRate();
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
				return getImmunityLossRate();
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
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE:
				setBitingRate((Double)newValue);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN:
				setInfectiousBitingProportionHuman((Double)newValue);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR:
				setInfectiousBitingProportionVector((Double)newValue);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE:
				setRecoveryRate((Double)newValue);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE:
				setIncubationRate((Double)newValue);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE:
				setVectorIncubationRate((Double)newValue);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
				setImmunityLossRate((Double)newValue);
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
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE:
				setBitingRate(BITING_RATE_EDEFAULT);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN:
				setInfectiousBitingProportionHuman(INFECTIOUS_BITING_PROPORTION_HUMAN_EDEFAULT);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR:
				setInfectiousBitingProportionVector(INFECTIOUS_BITING_PROPORTION_VECTOR_EDEFAULT);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE:
				setRecoveryRate(RECOVERY_RATE_EDEFAULT);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE:
				setIncubationRate(INCUBATION_RATE_EDEFAULT);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE:
				setVectorIncubationRate(VECTOR_INCUBATION_RATE_EDEFAULT);
				return;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
				setImmunityLossRate(IMMUNITY_LOSS_RATE_EDEFAULT);
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
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE:
				return bitingRate != BITING_RATE_EDEFAULT;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN:
				return infectiousBitingProportionHuman != INFECTIOUS_BITING_PROPORTION_HUMAN_EDEFAULT;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR:
				return infectiousBitingProportionVector != INFECTIOUS_BITING_PROPORTION_VECTOR_EDEFAULT;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE:
				return recoveryRate != RECOVERY_RATE_EDEFAULT;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE:
				return incubationRate != INCUBATION_RATE_EDEFAULT;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE:
				return vectorIncubationRate != VECTOR_INCUBATION_RATE_EDEFAULT;
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
				return immunityLossRate != IMMUNITY_LOSS_RATE_EDEFAULT;
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
		result.append(" (bitingRate: ");
		result.append(bitingRate);
		result.append(", infectiousBitingProportionHuman: ");
		result.append(infectiousBitingProportionHuman);
		result.append(", infectiousBitingProportionVector: ");
		result.append(infectiousBitingProportionVector);
		result.append(", recoveryRate: ");
		result.append(recoveryRate);
		result.append(", incubationRate: ");
		result.append(incubationRate);
		result.append(", vectorIncubationRate: ");
		result.append(vectorIncubationRate);
		result.append(", immunityLossRate: ");
		result.append(immunityLossRate);
		result.append(')');
		return result.toString();
	}

	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		double adjustedRecoveryRate = this.getRecoveryRate() * ((double) timeDelta / (double) getTimePeriod());
		double adjustedBitingRate = this.getBitingRate() * ((double)timeDelta / (double)getTimePeriod());
		double adjustedIncubationRate = this.getIncubationRate()*((double)timeDelta / (double)getTimePeriod());
		double adjustedImmunityLossRate = this.getImmunityLossRate()*((double)timeDelta / (double)getTimePeriod());
		double adjustedVectorIncubationRate = this.getVectorIncubationRate() * ((double)timeDelta / (double)getTimePeriod());

		for(int i=0;i<labels.size();++i) {
			final DynamicLabel label =  labels.get(i);
			IntegrationLabel ilabel = (IntegrationLabel)label;
			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();
			deltaValue.reset();
			
			// The method comes from Anderson & May Infectious Diseases of Humans
			// chapter 14.3, page 394 "Basic model for Malaria"

			// There are two options here depending upon the population
			// we are calculating a delta for. It's either the human
			// or the vector population. Determine which one we're
			// dealing with.

			String popIdentifier = diseaseLabel.getPopulationModelLabel().getPopulationIdentifier();
			diseaseLabel.getNode();

			if(popIdentifier.equals(this.getPopulationIdentifier())) {
				// Okay, we're dealing with humans (most likely)

				// The change in infected people is:
				// dy/dt = (abNV/N)yv(1-y)-gamma*y
				// where 
				//
				//NV=Total vector population
				//N=Total human population
				//yv = current fraction of infected vectors
				// y = current fraction of infected humans
				//a = biting rate
				//b = proportion infectious bites (human)

				SEIRLabelValue seirVal = (SEIRLabelValue)currentState;
				double totalHumanPop = seirVal.getPopulationCount();

				// Find the vector population

				SEIRLabel vecPop = findDiseaseLabel(diseaseLabel.getNode(), this.getVectorPopulationIdentifier());
				if(vecPop == null) {
					Activator.logError("Unable to find disease label for "+this.getVectorPopulationIdentifier()+" on node "+ diseaseLabel.getNode(), new Exception());
					return ;
				}

				SEIRLabelValue vectorValue = (SEIRLabelValue)vecPop.getProbeValue(); 
				double totalVectorPop = vectorValue.getPopulationCount();

				double absIChange=0.0, absEChange=0.0, absSChange=0.0, absRChange = 0.0;
				// SED 03/14/19. For stochastic modeling
				double numberOfSusceptibleToExposed = 0.0, numberOfExposedToInfectious=0.0,numberOfInfectedToRecovered=0.0, numberOfRecoveredToSusceptible=0.0;
				double incidence = 0.0;
				// Make sure we have both vectors and humans
				if(totalHumanPop > 0.0) {

					// If there are no vectors and no humans,
					double dydt = 0.0;
					if(totalVectorPop > 0.0) dydt =  (adjustedBitingRate*this.getInfectiousBitingProportionHuman()*totalVectorPop/totalHumanPop)* 
							(vectorValue.getI()/totalVectorPop)*seirVal.getS()/totalHumanPop;

					dydt = (Double.isNaN(dydt))? 0:dydt;

					if(dydt > 1.0)
						dydt = 1.0;

					if(dydt < -1.0)
						dydt = -1.0;

					double fracSChange = -dydt + adjustedImmunityLossRate*seirVal.getR() / totalHumanPop;
					double fracEChange =  dydt - adjustedIncubationRate*seirVal.getE()/totalHumanPop;
					double fracIChange = adjustedIncubationRate*seirVal.getE()/totalHumanPop-adjustedRecoveryRate*seirVal.getI()/totalHumanPop;
					double fracRChange = adjustedRecoveryRate*seirVal.getI()/totalHumanPop-adjustedImmunityLossRate*seirVal.getR() / totalHumanPop;

					absIChange = fracIChange * totalHumanPop;
					absSChange = fracSChange * totalHumanPop;
					absEChange = fracEChange * totalHumanPop;
					absRChange = fracRChange * totalHumanPop;

					incidence = dydt*totalHumanPop;
					// SED 03/14/19
					numberOfSusceptibleToExposed = incidence;
					numberOfExposedToInfectious = adjustedIncubationRate*seirVal.getE();
					numberOfInfectedToRecovered = adjustedRecoveryRate*seirVal.getI();
					numberOfRecoveredToSusceptible = adjustedImmunityLossRate*seirVal.getR();
					//			if(absIChange + absSChange + absEChange +absRChange != 0.0)
					//				Activator.logInformation("Mismatch "+(absIChange + absSChange + absEChange +absRChange));
				}
				
				

				/////////////////////////////////////////////////////////////////////////////
				// SED 03/14/2019
				// added to express the transitions. Necessary to support stochastic modeling
				// S->E
				Exchange seExchange = (Exchange)ExchangePool.POOL.get(); 
				seExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				seExchange.setTarget(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
				seExchange.setCount(numberOfSusceptibleToExposed);
				seExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
				seExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(seExchange);

				// E->I
				Exchange eiExchange = (Exchange)ExchangePool.POOL.get(); 
				eiExchange.setSource(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
				eiExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
				eiExchange.setCount(numberOfExposedToInfectious);
				eiExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(eiExchange);

				// I->R
				Exchange irExchange = (Exchange)ExchangePool.POOL.get(); 
				irExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
				irExchange.setTarget(StandardPackage.eINSTANCE.getSIRLabelValue_R());
				irExchange.setCount(numberOfInfectedToRecovered);
				irExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(irExchange);

				// R->S
				Exchange rsExchange = (Exchange)ExchangePool.POOL.get(); 
				rsExchange.setSource(StandardPackage.eINSTANCE.getSIRLabelValue_R());
				rsExchange.setTarget(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				rsExchange.setCount(numberOfRecoveredToSusceptible);
				rsExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(rsExchange);
				
		
				// added to express the transitions. Necessary to support stochastic modeling
				/////////////////////////////////////////////////////////////////////////////
				
				SEIRLabelValue retV = (SEIRLabelValue)deltaValue;
				retV.setI(absIChange);
				retV.setS(absSChange);
				retV.setE(absEChange);
				retV.setR(absRChange);

				retV.setIncidence(incidence);

			} else if (popIdentifier.equals(this.getVectorPopulationIdentifier())) {
				// We're dealing with the vector

				// The change in infected vectors are:
				// dyv/dt = acy(1-yv)-mu*yv
				// where 
				//
				//yv = current fraction of infected vectors
				// y = current fraction of infected humans
				//a = biting rate
				//c = proportion infectious bites (vector)

				SEIRLabelValue vectorVal = (SEIRLabelValue)currentState;
				double totalVectorPop = vectorVal.getPopulationCount();

				double absIChange=0.0, absEChange=0.0, absSChange=0.0;
				// SED 03/14/19. For stochastic modeling
				double numberOfSusceptibleToExposed = 0.0, numberOfExposedToInfectious=0.0;

				// Find the vector population
				if(totalVectorPop>0.0) {
					SEIRLabel humanPop = findDiseaseLabel(diseaseLabel.getNode(), this.getPopulationIdentifier());
					if(humanPop == null) {
						Activator.logError("Unable to find disease label for "+this.getPopulationIdentifier()+" on node "+ diseaseLabel.getNode(), new Exception());
						return ;
					}

					SEIRLabelValue seirVal = (SEIRLabelValue)humanPop.getTempValue(); // Temp value since it's safe to use


					// From the literate, the incubation period of the mosquito can be temperature
					// dependent. It follows the equation period (days) = 111/(T-16). See if 
					// we have temperature data available and if so, use that instead of the
					// rate specified in the model

					/* Commented out 3/6/16 since this is a generic MacDonald Ross model and not Malaria per say 
					for(NodeLabel nl:n.getLabels()) {
						if(nl instanceof EarthScienceLabel && ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getDataType().equals("nighttemp")) {
							Calendar c = Calendar.getInstance();
							c.setTime(time.getTime());
							int month = c.get(Calendar.MONTH); // deprecated but still works
							int nextMonth = month+1;
							if (nextMonth > 11) nextMonth = 0;
							double dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
							double daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH); 

							double fraction = dayOfMonth/daysInMonth;

							double temperature0 = ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getMean().get(month).doubleValue();
							double temperature1 = ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getMean().get(nextMonth).doubleValue();
							if(Math.rint(temperature0) == MISSING_DATA || Math.rint(temperature1) == MISSING_DATA)
								break;
							// interpolate
							double temperature = (fraction*temperature1) +(1.0-fraction)*temperature0;



							double vecIncDays = 111/(temperature-16);
							double vecIncRate = 0.0;
							if(vecIncDays <= 0 || Double.isInfinite(vecIncDays)) // It's too cold the parasite will never develop 
								vecIncRate = 0;
							else vecIncRate = 1/vecIncDays;

							adjustedVectorIncubationRate = vecIncRate * ((double)timeDelta / (double)getTimePeriod());
							break;
						}
					}
*/
					
					// For Philippines workshop
					adjustedVectorIncubationRate = this.getVectorIncubationRate()*((double)timeDelta / (double)getTimePeriod());
					
					
					final double effectiveInfectiousHuman = getNormalizedEffectiveInfectious(humanPop.getNode(), humanPop, seirVal.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);


					double fracSChange =  -adjustedBitingRate*this.getInfectiousBitingProportionVector()*(effectiveInfectiousHuman)*(vectorVal.getS()/totalVectorPop);
					double fracEChange = -fracSChange - adjustedVectorIncubationRate*vectorVal.getE()/totalVectorPop;
					double fracIChange = adjustedVectorIncubationRate*vectorVal.getE()/totalVectorPop;


					absIChange = fracIChange * totalVectorPop;
					absEChange = fracEChange * totalVectorPop;
					absSChange = fracSChange * totalVectorPop;

					// SED 03/14/19
					numberOfSusceptibleToExposed = -absSChange;
					numberOfExposedToInfectious = adjustedIncubationRate*vectorVal.getE();
					
					//				if(absIChange + absSChange + absEChange != 0.0)
					//					Activator.logInformation("Mismatch vector"+(absIChange + absSChange + absEChange));
				} 

				/////////////////////////////////////////////////////////////////////////////
				// SED 03/14/2019
				// added to express the transitions. Necessary to support stochastic modeling
				// S->E
				Exchange seExchange = (Exchange)ExchangePool.POOL.get(); 
				seExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
				seExchange.setTarget(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
				seExchange.setCount(numberOfSusceptibleToExposed);
				seExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
				seExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(seExchange);

				// E->I
				Exchange eiExchange = (Exchange)ExchangePool.POOL.get(); 
				eiExchange.setSource(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
				eiExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
				eiExchange.setCount(numberOfExposedToInfectious);
				eiExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
				deltaValue.getDepartures().add(eiExchange);
		
				// added to express the transitions. Necessary to support stochastic modeling
				/////////////////////////////////////////////////////////////////////////////
				SEIRLabelValue retV = (SEIRLabelValue)deltaValue;
				retV.setI(absIChange);
				retV.setS(absSChange);
				retV.setE(absEChange);
				retV.setR(0.0); // vector never recover
				retV.setIncidence(-absSChange); // Drop in susceptible is incidence since there is no recovery

			} else {
				Activator.logError("Cannot determine what to do with "+popIdentifier+" on node "+diseaseLabel.getNode(), new Exception());
			}

			//		if(((SILabelValue)returnValue).getI() + ((SILabelValue)currentState).getI() < 0 ||
			//			((SILabelValue)returnValue).getS() + ((SILabelValue)currentState).getS() < 0)
			//			Activator.logInformation("Error Negative");

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	}

	public void doModelSpecificAdjustments(LabelValue label) {
		// Nothing to do
	}

	@Override
	public void applyExternalDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		// Superclass handles external births/deaths
		super.applyExternalDeltas(time, t, timeDelta, labels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel label, long timeDelta) {
		// TODO Auto-generated stub. Implement doStochasticProcess(...) for MacdonaldRossDiseaseModelImpl.
		super.doStochasticProcess(label, timeDelta);
	} // doStochasticProcess


	SEIRLabel findDiseaseLabel(Node n, String identifier) {
		for(NodeLabel nl:n.getLabels()) {
			if(nl instanceof SEIRLabel
					&& ((DiseaseModelLabel)nl).getPopulationModelLabel().getPopulationIdentifier().equals(identifier))
				return (SEIRLabel)nl;
		}
		return null;
	}
} //MacdonaldRossDiseaseModelImpl
