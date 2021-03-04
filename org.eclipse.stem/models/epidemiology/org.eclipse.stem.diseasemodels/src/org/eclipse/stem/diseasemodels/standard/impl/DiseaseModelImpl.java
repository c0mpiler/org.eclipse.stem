package org.eclipse.stem.diseasemodels.standard.impl;

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

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.NodeDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.IntegrationDecoratorImpl;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.Constants;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.populationmodels.standard.DemographicPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Disease Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#getPopulationIdentifier <em>Population Identifier</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#getDiseaseName <em>Disease Name</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#isFiniteDifference <em>Finite Difference</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#isFrequencyDependent <em>Frequency Dependent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiseaseModelImpl extends IntegrationDecoratorImpl
		implements DiseaseModel {
	/**
	 * The default value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_IDENTIFIER_EDEFAULT = "human"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String populationIdentifier = POPULATION_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimePeriod() <em>Time Period</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTimePeriod()
	 * @generated NOT
	 * @ordered
	 */
	protected static final long TIME_PERIOD_EDEFAULT = STEMTime.Units.DAY
			.getMilliseconds();

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected long timePeriod = TIME_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseName() <em>Disease Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDiseaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISEASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiseaseName() <em>Disease Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDiseaseName()
	 * @generated
	 * @ordered
	 */
	protected String diseaseName = DISEASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isFiniteDifference() <em>Finite Difference</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isFiniteDifference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINITE_DIFFERENCE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFiniteDifference() <em>Finite Difference</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isFiniteDifference()
	 * @generated
	 * @ordered
	 */
	protected boolean finiteDifference = FINITE_DIFFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFrequencyDependent() <em>Frequency Dependent</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isFrequencyDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FREQUENCY_DEPENDENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFrequencyDependent() <em>Frequency Dependent</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isFrequencyDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean frequencyDependent = FREQUENCY_DEPENDENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newTimePeriod
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePeriod(long newTimePeriod) {
		timePeriod = newTimePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulationIdentifier() {
		return populationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newPopulationIdentifier
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationIdentifier(String newPopulationIdentifier) {
		populationIdentifier = newPopulationIdentifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiseaseName() {
		return diseaseName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseName(String newDiseaseName) {
		diseaseName = newDiseaseName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFiniteDifference() {
		return finiteDifference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiniteDifference(boolean newFiniteDifference) {
		finiteDifference = newFiniteDifference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFrequencyDependent() {
		return frequencyDependent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyDependent(boolean newFrequencyDependent) {
		frequencyDependent = newFrequencyDependent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(
			String populationIdentifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Infector createInfector() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<String> getAllLabelIdentifiers() {
		EList<String> identifiers = new BasicEList<String>();

		identifiers.add(getPopulationIdentifier());

		return identifiers;
	}

	/**
	 * Search through the graph and find all of the population model labels
	 * (i.e. dynamic labels) that have the same identifier.
	 * 
	 * @param populationIdentifier
	 *            the population being labeled
	 * @param graph
	 *            the graph to search
	 * @return the PopulationLabel instances of the graph that match the
	 *         identifier.
	 * @throws ScenarioInitializationException 
	 * @generated NOT
	 */
	@SuppressWarnings("unused")
	public EList<PopulationModelLabel> getPopulationModelLabels(
			String populationIdentifier, Graph graph) throws ScenarioInitializationException {
		final EList<PopulationModelLabel> retValue = new BasicEList<PopulationModelLabel>();

		// Iterate through all of the population labels in the graph
		EList<NodeLabel> labels = graph
				.getNodeLabelsByTypeURI(PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);
		for (NodeLabel pl : labels) {
			final PopulationModelLabel populationLabel = (PopulationModelLabel) pl;
			// Is this label for the population we're looking for?
			if (populationLabel.getPopulationIdentifier().equals(
					populationIdentifier)) {
				// Yes
				// If there is a problem with the "node uri" of the population
				// label then it would not have been associated with a node
				// instance in the graph at this point. This is a problem for
				// disease models that are trying to label the node (there isn't
				// one!). So filter out those mistakes here.

				// Does the population label have an associated node?
				if (populationLabel.getNode() != null) {
					// Yes
					retValue.add(populationLabel);
				} // if the population label has a node
			} // if the population we're looking for
		} // for each population label

		return retValue;
	}

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#decorateGraph(org.eclipse.stem.core.graph.Graph)
	 */
	@Override
	public void decorateGraph(STEMTime time) throws ScenarioInitializationException  {
		if (this.isGraphDecorated())
			return;
		// If we already have labels to update we're done
		if (getLabelsToUpdate().size() > 0)
			return;
		boolean success = false;

		for (PopulationModelLabel populationModelLabel: getPopulationModelLabels(
				getPopulationIdentifier(), getGraph())) {
			success = true;

			final DiseaseModelLabel dml = createDiseaseModelLabel(populationModelLabel
					.getPopulationIdentifier());
			DiseaseModelLabelImpl.labelNode(dml, populationModelLabel,
					populationModelLabel.getNode());

			// Make a unique URI for the label that's the same across running
			// instances
			URI unique = STEMURI.createURI(Label.URI_TYPE_LABEL_SEGMENT + "/" //$NON-NLS-1$
					+ populationModelLabel.getNode().getURI().lastSegment()
					+ "/" + this.getDiseaseName() + "/" //$NON-NLS-1$ //$NON-NLS-2$
					+ populationModelLabel.getPopulationIdentifier());
			dml.setURI(unique);
			dml.getDublinCore().setIdentifier(unique.toString());

			getLabelsToUpdate().add(dml);

			getGraph().putNodeLabel(dml);

			// Initialize the disease model state (if any). The state holds
			// values useful for the computation of the disease model
			// sfinal DiseaseModelState diseaseModelState =
			// createDiseaseModelState();

			// Commented out 4/1/10 Not used any more
			// dml.setDiseaseModelState(initializeDiseaseState(diseaseModelState,
			// dml));
		} // for each population label

		if(!success) {
			// The disease model did not find any population model labels needed
			// to create its disease labels. This is a problem, the user must
			// have forgotten to add a population model.
			throw new ScenarioInitializationException(NLS.bind(Messages.DM_MISSING_POP_MOD_LABELS, new Object[] {this.getURI().toString(), this.getPopulationIdentifier()}), this, new Exception());
		}
		// We've made one pass labeling the Node's with the disease model label,
		// and we created DiseaseModelState instances that are specific to this
		// disease that hold state information useful in its computations.
		// Having made one pass we need to give the disease model another chance
		// to update its state information with things it learned during the
		// first pass (e.g., the total population or total area).

		// Commented out 4/1/10 Not used any more

		// for (Iterator diseseModelLabelIter = getLabelsToUpdate().iterator();
		// diseseModelLabelIter.hasNext();) {
		// initializeDiseaseState((DiseaseModelLabel)
		// diseseModelLabelIter.next());
		// } // for each label this disease model updates

		// This initializes the disease model values from the population values.
		// For instance for StandardDiseaseModels, it initializes the
		// susceptiable population from the population
		resetLabels();
	} // decorateGraph

	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.core.model.impl.IntegrationDecoratorImpl#getCompartments(java.lang.String)
	 */
	@Override
	public List<IItemPropertyDescriptor> getCompartments(String populationIdentifier) {
		
		if (populationIdentifier == null) {
			populationIdentifier = getPopulationIdentifier();
		}
		
		DiseaseModelLabel label = createDiseaseModelLabel(populationIdentifier);
		
		final RelativeValueProviderAdapter rvp = (RelativeValueProviderAdapter)
				RelativeValueProviderAdapterFactory.INSTANCE.adapt(label, RelativeValueProvider.class);

		// Does the label have relative values?
		if (rvp != null) {
			// Yes
			rvp.setTarget(label);
			return rvp.getProperties();
		}
		
		return null;
	}
	
	protected boolean findPopulationModel(Model m, String population) {
		boolean found = false;
		// Check sub models first
		for (Model m2 : m.getModels()) {
			found = findPopulationModel(m2, population);
			if (found)
				break;
		}
		if (found)
			return found;

		for (NodeDecorator dec : m.getNodeDecorators()) {
			if (dec instanceof DemographicPopulationModel) {
				DemographicPopulationModel dpm = (DemographicPopulationModel) dec;
				if (dpm.getPopulationIdentifier().equals(population)) {
					found = true;
					break;
				}
				// Any of the groups match?
				boolean match = false;
				for (PopulationGroup pg : dpm.getPopulationGroups()) {
					if (pg.getIdentifier().equals(population)) {
						match = true;
						break;
					}
				}
				if (match) {
					found = true;
					break;
				}
			} else if (dec instanceof PopulationModel
					&& ((PopulationModel) dec).getPopulationIdentifier()
							.equals(population)) {
				found = true;
				break;
			}
		}
		return found;
	}

	protected StandardInterventionLabel findInterventionLabel(Node node) {
		for(int i=0;i<node.getLabels().size();++i) {
			NodeLabel l = node.getLabels().get(i);
			if (l instanceof StandardInterventionLabel
					&& ((StandardInterventionLabel) l)
							.getPopulationIdentifier().equals(
									this.getPopulationIdentifier()))
				return (StandardInterventionLabel) l;
		}
		return null;
	}

	/**
	 * Prepare the decorator. A subclass needs to override this method if
	 * pre-processing steps are necessary before the decorator is being used
	 * 
	 * 
	 */
	@Override
	public void prepare(Model model, STEMTime time) {

		// Check whether a population model exists for the disease model. If
		// not, create
		// a new population model with birth/death rate 0.

		boolean found = findPopulationModel(model,
				this.getPopulationIdentifier());

		if (!found) {
			// Create a new standard population model
			StandardPopulationModel spm = StandardFactory.eINSTANCE
					.createStandardPopulationModel();
			spm.setPopulationIdentifier(this.getPopulationIdentifier());
			String title = "Auto Generated " + this.getPopulationIdentifier() //$NON-NLS-1$
					+ " population model"; //$NON-NLS-1$
			String name = "auto_gen_" + this.getPopulationIdentifier() //$NON-NLS-1$
					+ "_population_model"; //$NON-NLS-1$
			spm.setURI(STEMURI.createURI(name + "/" //$NON-NLS-1$
					+ STEMURI.generateUniquePart()));
			spm.setName(name);
			spm.getDublinCore().setTitle(title);
			if(this.isAddStochasticNoise())
				spm.setAddStochasticNoise(true);
			model.getNodeDecorators().add(0, spm);
		}
	}

	
	/**
	 * Create the exchanges needed for disease models. Go through all the eAttributes in the label value and find ones of type disease deaths. Add them all up and 
	 * create an exchange with the total deaths so that the population model is aware of it
	 * 
	 * @param integrationLabelValue The delta value wherein the exchanges will be added
	 */
	@Override
	public void computeAdditionalDeltasAndExchanges(IntegrationLabel integrationLabel, STEMTime time, double t, long timeDelta) {
		
//		while(integrationLabel.getDeltaValue().getArrivals().size()>0) ExchangePool.POOL.release(integrationLabel.getDeltaValue().getArrivals().remove(0));
//		while(integrationLabel.getDeltaValue().getDepartures().size()>0) ExchangePool.POOL.release(integrationLabel.getDeltaValue().getDepartures().remove(0));
		
		IntegrationLabelValue delta = integrationLabel.getDeltaValue();
		EList<EAttribute>allAttrs = delta.eClass().getEAllAttributes();
		for(int i=0;i<allAttrs.size();++i) {
			EAttribute attr = allAttrs.get(i);
			if(isDiseaseDeaths(attr)) {
				double deaths = delta.eGetDouble(attr.getFeatureID());
				Exchange deathExchange = (Exchange)ExchangePool.POOL.get();

				deathExchange.setType(ExchangeType.BIRTHS_AND_DEATHS);
				deathExchange.setCount(deaths);
				deathExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I()); // We assume the I compartment here. If a disease model have other infectious compartment with different disease daths comparments the must manually create the BIRTHS_DEATHS exchange
				deathExchange.setTarget(attr);
				delta.getDepartures().add(deathExchange);
			}
		}			
	}

	
	private static String getAttributeType(EAttribute attr)
	{
		EAnnotation a = attr.getEAnnotation(Constants.COMPARTMENT_TYPE_ANNOTATION_SOURCE);
		if (a == null) {
			return null;
		}
		return a.getDetails().get("type");
	}
	
	/**
	 * Checks whether the specified attribute is a disease deaths compartment
	 * @param attr The attribute to check
	 * @return Whether the attribute is a disease deaths compartment
	 */
	public static boolean isDiseaseDeaths(EAttribute attr) {		
		return attr.getName().startsWith("diseaseDeaths") || Constants.COMPARTMENT_TYPE_DEATHS.equalsIgnoreCase(getAttributeType(attr));
	}
	
	/**
	 * Checks whether the specified attribute is an incidence compartment
	 * @param attr The attribute to check
	 * @return Whether the attribute is an incidence compartment
	 */
	public static boolean isIncidence(EAttribute attr) {
		return attr.getName().startsWith("incidence") || Constants.COMPARTMENT_TYPE_INCIDENCE.equalsIgnoreCase(getAttributeType(attr));
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param resolve
	 * @param coreType
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL__POPULATION_IDENTIFIER:
				return getPopulationIdentifier();
			case StandardPackage.DISEASE_MODEL__TIME_PERIOD:
				return getTimePeriod();
			case StandardPackage.DISEASE_MODEL__DISEASE_NAME:
				return getDiseaseName();
			case StandardPackage.DISEASE_MODEL__FINITE_DIFFERENCE:
				return isFiniteDifference();
			case StandardPackage.DISEASE_MODEL__FREQUENCY_DEPENDENT:
				return isFrequencyDependent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param newValue
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL__POPULATION_IDENTIFIER:
				setPopulationIdentifier((String)newValue);
				return;
			case StandardPackage.DISEASE_MODEL__TIME_PERIOD:
				setTimePeriod((Long)newValue);
				return;
			case StandardPackage.DISEASE_MODEL__DISEASE_NAME:
				setDiseaseName((String)newValue);
				return;
			case StandardPackage.DISEASE_MODEL__FINITE_DIFFERENCE:
				setFiniteDifference((Boolean)newValue);
				return;
			case StandardPackage.DISEASE_MODEL__FREQUENCY_DEPENDENT:
				setFrequencyDependent((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL__POPULATION_IDENTIFIER:
				setPopulationIdentifier(POPULATION_IDENTIFIER_EDEFAULT);
				return;
			case StandardPackage.DISEASE_MODEL__TIME_PERIOD:
				setTimePeriod(TIME_PERIOD_EDEFAULT);
				return;
			case StandardPackage.DISEASE_MODEL__DISEASE_NAME:
				setDiseaseName(DISEASE_NAME_EDEFAULT);
				return;
			case StandardPackage.DISEASE_MODEL__FINITE_DIFFERENCE:
				setFiniteDifference(FINITE_DIFFERENCE_EDEFAULT);
				return;
			case StandardPackage.DISEASE_MODEL__FREQUENCY_DEPENDENT:
				setFrequencyDependent(FREQUENCY_DEPENDENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL__POPULATION_IDENTIFIER:
				return POPULATION_IDENTIFIER_EDEFAULT == null ? populationIdentifier != null : !POPULATION_IDENTIFIER_EDEFAULT.equals(populationIdentifier);
			case StandardPackage.DISEASE_MODEL__TIME_PERIOD:
				return timePeriod != TIME_PERIOD_EDEFAULT;
			case StandardPackage.DISEASE_MODEL__DISEASE_NAME:
				return DISEASE_NAME_EDEFAULT == null ? diseaseName != null : !DISEASE_NAME_EDEFAULT.equals(diseaseName);
			case StandardPackage.DISEASE_MODEL__FINITE_DIFFERENCE:
				return finiteDifference != FINITE_DIFFERENCE_EDEFAULT;
			case StandardPackage.DISEASE_MODEL__FREQUENCY_DEPENDENT:
				return frequencyDependent != FREQUENCY_DEPENDENT_EDEFAULT;
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
		result.append(" (populationIdentifier: "); //$NON-NLS-1$
		result.append(populationIdentifier);
		result.append(", timePeriod: "); //$NON-NLS-1$
		result.append(timePeriod);
		result.append(", diseaseName: "); //$NON-NLS-1$
		result.append(diseaseName);
		result.append(", finiteDifference: "); //$NON-NLS-1$
		result.append(finiteDifference);
		result.append(", frequencyDependent: "); //$NON-NLS-1$
		result.append(frequencyDependent);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.eclipse.stem.core.model.impl.NodeDecoratorImpl#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();

		retValue = retValue && getDiseaseName() != null;
		assert retValue;

		retValue = retValue && getTimePeriod() >= 0.0;
		assert retValue;

		return retValue;
	} // sane

} // DiseaseModelImpl
