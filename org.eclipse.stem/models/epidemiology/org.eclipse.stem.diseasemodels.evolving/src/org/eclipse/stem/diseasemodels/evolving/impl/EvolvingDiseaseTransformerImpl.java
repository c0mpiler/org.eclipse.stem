/**
 */
package org.eclipse.stem.diseasemodels.evolving.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.TransformationDecoratorImpl;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Disease Transformer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl#getBaseDisease <em>Base Disease</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl#getEvolvedDiseases <em>Evolved Diseases</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl#getEvolutionCount <em>Evolution Count</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl#getEvolutionCountHardLimit <em>Evolution Count Hard Limit</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl#isStopAllEvolution <em>Stop All Evolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvolvingDiseaseTransformerImpl extends TransformationDecoratorImpl implements EvolvingDiseaseTransformer {
	/**
	 * The cached value of the '{@link #getBaseDisease() <em>Base Disease</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBaseDisease()
	 * @generated
	 * @ordered
	 */
	protected DiseaseModel baseDisease;
	/**
	 * The cached value of the '{@link #getEvolvedDiseases() <em>Evolved Diseases</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEvolvedDiseases()
	 * @generated
	 * @ordered
	 */
	protected EList<DiseaseModel> evolvedDiseases;
	/**
	 * The default value of the '{@link #getEvolutionCount() <em>Evolution Count</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEvolutionCount()
	 * @generated
	 * @ordered
	 */
	protected static final int EVOLUTION_COUNT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getEvolutionCount() <em>Evolution Count</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEvolutionCount()
	 * @generated
	 * @ordered
	 */
	protected int evolutionCount = EVOLUTION_COUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getEvolutionCountHardLimit() <em>Evolution Count Hard Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionCountHardLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int EVOLUTION_COUNT_HARD_LIMIT_EDEFAULT = 255;
	/**
	 * The cached value of the '{@link #getEvolutionCountHardLimit() <em>Evolution Count Hard Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionCountHardLimit()
	 * @generated
	 * @ordered
	 */
	protected int evolutionCountHardLimit = EVOLUTION_COUNT_HARD_LIMIT_EDEFAULT;
	/**
	 * The default value of the '{@link #isStopAllEvolution() <em>Stop All Evolution</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isStopAllEvolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOP_ALL_EVOLUTION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStopAllEvolution() <em>Stop All Evolution</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isStopAllEvolution()
	 * @generated
	 * @ordered
	 */
	protected boolean stopAllEvolution = STOP_ALL_EVOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EvolvingDiseaseTransformerImpl() {
		super();
		// TODO This probably needs to be inherited from the disease model
        this.setURI(STEMURI.createURI("/" + STEMURI.generateUniquePart()+"/EvolvingDiseaseTransformerImpl" ) );
        setTypeURI(URI_TYPE_TRANSFORMER);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolvingPackage.Literals.EVOLVING_DISEASE_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModel getBaseDisease() {
		if (baseDisease != null && baseDisease.eIsProxy()) {
			InternalEObject oldBaseDisease = (InternalEObject)baseDisease;
			baseDisease = (DiseaseModel)eResolveProxy(oldBaseDisease);
			if (baseDisease != oldBaseDisease) {
			}
		}
		return baseDisease;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModel basicGetBaseDisease() {
		return baseDisease;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDisease(DiseaseModel newBaseDisease) {
		baseDisease = newBaseDisease;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiseaseModel> getEvolvedDiseases() {
		if (evolvedDiseases == null) {
			evolvedDiseases = new BasicInternalEList<DiseaseModel>(DiseaseModel.class);
		}
		return evolvedDiseases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getEvolutionCount() {
		return evolutionCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionCount(int newEvolutionCount) {
		evolutionCount = newEvolutionCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getEvolutionCountHardLimit() {
		return evolutionCountHardLimit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionCountHardLimit(int newEvolutionCountHardLimit) {
		evolutionCountHardLimit = newEvolutionCountHardLimit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStopAllEvolution() {
		return stopAllEvolution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopAllEvolution(boolean newStopAllEvolution) {
		stopAllEvolution = newStopAllEvolution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__BASE_DISEASE:
				if (resolve) return getBaseDisease();
				return basicGetBaseDisease();
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLVED_DISEASES:
				return getEvolvedDiseases();
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT:
				return getEvolutionCount();
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT:
				return getEvolutionCountHardLimit();
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION:
				return isStopAllEvolution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__BASE_DISEASE:
				setBaseDisease((DiseaseModel)newValue);
				return;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLVED_DISEASES:
				getEvolvedDiseases().clear();
				getEvolvedDiseases().addAll((Collection<? extends DiseaseModel>)newValue);
				return;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT:
				setEvolutionCount((Integer)newValue);
				return;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT:
				setEvolutionCountHardLimit((Integer)newValue);
				return;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION:
				setStopAllEvolution((Boolean)newValue);
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
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__BASE_DISEASE:
				setBaseDisease((DiseaseModel)null);
				return;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLVED_DISEASES:
				getEvolvedDiseases().clear();
				return;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT:
				setEvolutionCount(EVOLUTION_COUNT_EDEFAULT);
				return;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT:
				setEvolutionCountHardLimit(EVOLUTION_COUNT_HARD_LIMIT_EDEFAULT);
				return;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION:
				setStopAllEvolution(STOP_ALL_EVOLUTION_EDEFAULT);
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
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__BASE_DISEASE:
				return baseDisease != null;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLVED_DISEASES:
				return evolvedDiseases != null && !evolvedDiseases.isEmpty();
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT:
				return evolutionCount != EVOLUTION_COUNT_EDEFAULT;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT:
				return evolutionCountHardLimit != EVOLUTION_COUNT_HARD_LIMIT_EDEFAULT;
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION:
				return stopAllEvolution != STOP_ALL_EVOLUTION_EDEFAULT;
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
		result.append(" (evolutionCount: ");
		result.append(evolutionCount);
		result.append(", evolutionCountHardLimit: ");
		result.append(evolutionCountHardLimit);
		result.append(", stopAllEvolution: ");
		result.append(stopAllEvolution);
		result.append(')');
		return result.toString();
	}

	@Override
	public void updateLabels(STEMTime time, long timerPeriod, int cycle) {

		// if we have hit the hard limit on max mutations (max Diseases)
		if (this.stopAllEvolution) {
			return;
		}

//		int evolvingLabelCount = 0;
//		int diseaseLabelCount = 0;
//		int totalLabelCount = 0;
//		int evolutions = 0;

		Set<URI> exisitingNodeKeys = new HashSet<URI>(getGraph().getNodeLabels().keySet());

		for (URI nodeUri : exisitingNodeKeys) {

			// for (Entry<URI,NodeLabel> nodeLabel :
			// getGraph().getNodeLabels().entrySet()) {

			NodeLabel nodeLabel = getGraph().getNodeLabels().get(nodeUri);

			//totalLabelCount++;
			if (nodeLabel instanceof DiseaseModelLabel) {
				//diseaseLabelCount++;
				DiseaseModelLabel dmLabel = (DiseaseModelLabel) nodeLabel;
				if (dmLabel.getDecorator() instanceof EvolvingDiseaseModel) {
					//evolvingLabelCount++;
					EvolvingDiseaseModel baseDiseaseModel = (EvolvingDiseaseModel) dmLabel.getDecorator();

					// ********** EVOLVE **********
					EvolvingDiseaseModel evolvedDiseaseModel = baseDiseaseModel.evolve(dmLabel);
					if (evolvedDiseaseModel != null) {
						evolutionCount++;
						if (evolutionCount >= evolutionCountHardLimit) {
							System.out.println("Evolution Count Exceeds hard limit");
							this.stopAllEvolution = true;
						}
						try {
							DiseaseModel evolvedDiseaseAsModel = ((DiseaseModel) evolvedDiseaseModel);
							getEvolvedDiseases().add(evolvedDiseaseAsModel);
							getGraph().getDecorators().add(evolvedDiseaseAsModel);
							evolvedDiseaseAsModel.decorateGraph(time);
							evolvedDiseaseAsModel.setGraphDecorated(true);
							evolvedDiseaseModel.calculateEvolvedInitialState();

							System.err.println("*** Mutation ***" + evolutionCount);
						} catch (ScenarioInitializationException sne) {
							System.err.println("Error decorating mutated disease model");
						}
					}
				}
			}
		}

		 //System.err.println("- Evolution Transform Complete ["+hashCode()+"]" +
		 //"{"+cycle+","+totalLabelCount+","+diseaseLabelCount+","+evolvingLabelCount+","+getEvolutionCount()+"}");
	}

	@Override
	public void decorateGraph(STEMTime time) throws ScenarioInitializationException {

	}

	@Override
	public void resetLabels() throws ScenarioInitializationException {
		super.resetLabels();
		evolutionCount = EVOLUTION_COUNT_EDEFAULT;
		getEvolvedDiseases().clear();
	}

} // EvolvingDiseaseTransformerImpl
