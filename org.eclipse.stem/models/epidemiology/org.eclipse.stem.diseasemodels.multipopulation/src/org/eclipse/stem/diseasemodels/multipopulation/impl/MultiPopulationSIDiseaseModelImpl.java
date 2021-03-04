package org.eclipse.stem.diseasemodels.multipopulation.impl;

import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DoubleValue;
import org.eclipse.stem.core.common.DoubleValueList;
import org.eclipse.stem.core.common.DoubleValueMatrix;
import org.eclipse.stem.core.common.StringValue;
import org.eclipse.stem.core.common.StringValueList;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.edges.MixingEdge;
import org.eclipse.stem.definitions.edges.MixingEdgeLabelValue;
import org.eclipse.stem.definitions.edges.impl.MixingEdgeLabelImpl;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl;
import org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.diseasemodels.Activator;
import org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel;
import org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.SILabel;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModel;
import org.eclipse.stem.populationmodels.standard.impl.StandardFactoryImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Multi Population SI Disease Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIDiseaseModelImpl#getPopulationGroups <em>Population Groups</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIDiseaseModelImpl#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIDiseaseModelImpl#getRecoveryRate <em>Recovery Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIDiseaseModelImpl#getInfectiousMortalityRate <em>Infectious Mortality Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPopulationSIDiseaseModelImpl extends StandardDiseaseModelImpl
implements MultiPopulationSIDiseaseModel {
	/**
	 * The cached value of the '{@link #getPopulationGroups() <em>Population Groups</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getPopulationGroups()
	 * @generated
	 * @ordered
	 */
	protected StringValueList populationGroups;

	/**
	 * The cached value of the '{@link #getTransmissionRate() <em>Transmission Rate</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected DoubleValueMatrix transmissionRate;

	/**
	 * The cached value of the '{@link #getRecoveryRate() <em>Recovery Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryRate()
	 * @generated
	 * @ordered
	 */
	protected DoubleValueList recoveryRate;

	/**
	 * The cached value of the '{@link #getInfectiousMortalityRate()
	 * <em>Infectious Mortality Rate</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInfectiousMortalityRate()
	 * @generated
	 * @ordered
	 */
	protected DoubleValueList infectiousMortalityRate;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public MultiPopulationSIDiseaseModelImpl() {
		super();
	}

	
	/**
	 * We need to override this method to make sure the denominator is correct for neighboring nodes
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.SI.getNormalizedEffectiveInfectious
	 * @param node
	 *            the node we are currently looking at to compute the next
	 *            disease state
	 * @param diseaseLabel
	 *            the label for the current disease computation
	 * @param onsiteInfectious
	 *            the number of infectious people on site (at the node above)
	 * @param infectiousAttribute
	 *            Attribute representing the infectious compartment
	 * @generated NOT
	 */
	
	@Override
	public double getNormalizedEffectiveInfectious(final Node node,
			final StandardDiseaseModelLabel diseaseLabel,
			final double onsiteInfectious, EAttribute infectiousAttribute, EAttribute mixingAttribute, EAttribute roadAttribute) {
	
		// Determine whether to use mixing edges or common border edges
		determineMixingStrategy();
		
		// For performance, check if mixing parameters are zero. If so, just
		// return the unmixed result
		
		if( doCommonBorderMixing && (Double)this.eGet(mixingAttribute) == 0.0 && (Double)this.eGet(roadAttribute) == 0.0) {
			// Compute the the total population for all cohorts. 
			double totalPopulation = 0.0;
			EList<NodeLabel> nodeLabels = node.getLabels();
			for(int j = 0; j < nodeLabels.size(); j ++) {
				NodeLabel nlabel = nodeLabels.get(j);
				if (nlabel instanceof DiseaseModelLabel && this == ((DiseaseModelLabel)nlabel).getDecorator()) {
						DiseaseModelLabel dml = (DiseaseModelLabel)nlabel;
						DiseaseModelLabelValue dmlv = (DiseaseModelLabelValue)dml.getTempValue();
						totalPopulation = totalPopulation + dmlv.getPopulationCount();
				}
			}
			double retVal = 0.0;

			if (totalPopulation > 0.0) 
				retVal = onsiteInfectious 	/ totalPopulation;
			return retVal;
		}
		
		@SuppressWarnings("unchecked")
		List<Edge>cEdges = (List<Edge>)edgeListObjectPool.get();
		cEdges.clear();
		
		if(!doCommonBorderMixing)
			return doMixingViaMixingEdges(node, diseaseLabel, onsiteInfectious, infectiousAttribute, mixingAttribute, roadAttribute);
		else 
			return doMixingViaCommonBorderEdges(node, diseaseLabel, onsiteInfectious, infectiousAttribute, mixingAttribute, roadAttribute);
		
	} // getNormalizedEffectiveInfectious

	/**
	 * Compute the mixing using common border edges. This code is only used when mixing edges are not available
	 * 
	 * @param node
	 * @param diseaseLabel
	 * @param onsiteInfectious
	 * @param infectiousAttribute
	 * @param cEdges
	 * @return double Normalized effective infectious
	 */
	private double doMixingViaMixingEdges(Node node,
			StandardDiseaseModelLabel diseaseLabel, double onsiteInfectious,
			EAttribute infectiousAttribute, EAttribute mixingAttribute, EAttribute roadAttribute) {
		double infectiousChangeFromMixing = 0.0;
		double populationChangeFromMixing = 0.0;

		@SuppressWarnings("unchecked")
		List<Edge>mEdges = (List<Edge>)edgeListObjectPool.get();
		mEdges.clear();
		MixingEdgeLabelImpl.getMixingEdgesFromNode(node, this.getPopulationIdentifier(), mEdges);
		
		for(int i=0;i<mEdges.size();++i) {
			MixingEdge mixingEdge =(MixingEdge)mEdges.get(i);
			MixingEdgeLabelValue mixingLabelValue = mixingEdge.getLabel().getCurrentValue();
			double mixingRateOrAbs = mixingLabelValue.getMixingRate();
			boolean useAbsoluteValue = mixingEdge.isUseAbsoluteValues();
			
			final Node otherNode = mixingEdge.getOtherNode(node);
			if (otherNode instanceof Region) {
				double otherInfective = 0.0;

				// Compute the the total population for all cohorts. 
				double totalPopulation = 0.0;
				EList<NodeLabel> nodeLabels = otherNode.getLabels();
				for(int j = 0; j < nodeLabels.size(); j ++) {
					NodeLabel nlabel = nodeLabels.get(j);
					if (nlabel instanceof DiseaseModelLabel && this == ((DiseaseModelLabel)nlabel).getDecorator()) {
							DiseaseModelLabel dml = (DiseaseModelLabel)nlabel;
							DiseaseModelLabelValue dmlv = (DiseaseModelLabelValue)dml.getTempValue();
							totalPopulation = totalPopulation + dmlv.getPopulationCount();
					}
				}
				
				EList<NodeLabel>labs = otherNode.getLabels();
				for(int j=0;j<labs.size();++j) {
					NodeLabel otherLabel = labs.get(j);
				    if (otherLabel instanceof StandardDiseaseModelLabel) {
						StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;

						if (otherDiseaseLabel.getDecorator() == this
								&& otherDiseaseLabel.getIdentifier().equals(
										diseaseLabel.getIdentifier())) {
							
							otherInfective = otherDiseaseLabel
									.getTempValue().eGetDouble(
											infectiousAttribute.getFeatureID());
							break;
						}
					}
				}

				if(useAbsoluteValue && totalPopulation > 0.0) {
					if(mixingRateOrAbs > totalPopulation) // Cannot mix with more people than currently available
						mixingRateOrAbs = totalPopulation;
					double fraction = mixingRateOrAbs / totalPopulation; // Do get the right scaling for the population change we need this
					infectiousChangeFromMixing += fraction * otherInfective;
					populationChangeFromMixing += fraction * totalPopulation;
				} else {
					infectiousChangeFromMixing += mixingRateOrAbs * otherInfective;
					populationChangeFromMixing += mixingRateOrAbs * totalPopulation;
				}
			}
		} // for each border edge
		edgeListObjectPool.release(mEdges);
		
		return addMixingRoadTransportationEdges(node,
			diseaseLabel, onsiteInfectious,
			infectiousAttribute, infectiousChangeFromMixing, populationChangeFromMixing, roadAttribute);
	}
	
	private double addMixingRoadTransportationEdges(Node node,
			StandardDiseaseModelLabel diseaseLabel, double onsiteInfectious,
			EAttribute infectiousAttribute, double currentInfectiousChangeFromMixing,
			double currentPopulationChangeFromMixing, EAttribute roadAttribute) {
		double infectiousChangeFromMixing = currentInfectiousChangeFromMixing;
		double populationChangeFromMixing = currentPopulationChangeFromMixing;
		
		@SuppressWarnings("unchecked")
		List<Edge>rEdges = (List<Edge>)edgeListObjectPool.get();
		rEdges.clear();
		RoadTransportRelationshipLabelImpl.getRoadEdgesFromNode(node, rEdges);
		for(int i=0;i<rEdges.size();++i) {
			Edge roadEdge = rEdges.get(i);
			// find the number of edges from the road edge - could be more than
			// one
			// also, roads have differenct capacities
			EdgeLabel edgeLabel = roadEdge.getLabel();
			double numCrossings = ((RoadTransportRelationshipLabelValue) edgeLabel
					.getCurrentValue()).getNumberCrossings();
			double infectiousProportion = Math.min(
					(Double)this.eGet(roadAttribute) * numCrossings, 1.0);

			// If it exists, we're looking for the label this disease model
			// updates on the node at the other end of the border edge.
			Node otherNode = roadEdge.getOtherNode(node);
			double otherInfective = 0.0;

			// Compute the the total population for all cohorts. 
			double totalPopulation = 0.0;
			EList<NodeLabel> nodeLabels = otherNode.getLabels();
			for(int j = 0; j < nodeLabels.size(); j ++) {
				NodeLabel nlabel = nodeLabels.get(j);
				if (nlabel instanceof DiseaseModelLabel && this == ((DiseaseModelLabel)nlabel).getDecorator()) {
						DiseaseModelLabel dml = (DiseaseModelLabel)nlabel;
						DiseaseModelLabelValue dmlv = (DiseaseModelLabelValue)dml.getTempValue();
						totalPopulation = totalPopulation + dmlv.getPopulationCount();
				}
			}
			
			
			EList<NodeLabel>labs = otherNode.getLabels();
			for(int j=0;j<labs.size();++j) {
				NodeLabel otherLabel = labs.get(j);
				if (otherLabel instanceof StandardDiseaseModelLabel) {
					StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;

					if (otherDiseaseLabel.getDecorator() == this
							&& otherDiseaseLabel.getIdentifier().equals(
									diseaseLabel.getIdentifier())) {
						
						otherInfective =  otherDiseaseLabel
								.getTempValue().eGetDouble(infectiousAttribute.getFeatureID());
						break;
					}
				}
			}

			infectiousChangeFromMixing += infectiousProportion * otherInfective;
			populationChangeFromMixing += infectiousProportion
					* totalPopulation;
		} // for each road edge

		edgeListObjectPool.release(rEdges);
		
		// Compute the the total population for all cohorts. 
		double totalPopulation = 0.0;
		EList<NodeLabel> nodeLabels = node.getLabels();
		for(int j = 0; j < nodeLabels.size(); j ++) {
			NodeLabel nlabel = nodeLabels.get(j);
			if (nlabel instanceof DiseaseModelLabel && this == ((DiseaseModelLabel)nlabel).getDecorator()) {
					DiseaseModelLabel dml = (DiseaseModelLabel)nlabel;
					DiseaseModelLabelValue dmlv = (DiseaseModelLabelValue)dml.getTempValue();
					totalPopulation = totalPopulation + dmlv.getPopulationCount();
			}
		}
		// return the sum normalized to the total population
		totalPopulation = totalPopulation + populationChangeFromMixing;
		double retVal = 0.0;

		if (totalPopulation > 0.0) {
			retVal = (onsiteInfectious + infectiousChangeFromMixing)
					/ totalPopulation;
		}

		return retVal;
	}

	/**
	 * Compute the mixing using common border edges. This code is only used when mixing edges are not available
	 * 
	 * @param node
	 * @param diseaseLabel
	 * @param onsiteInfectious
	 * @param infectiousAttribute
	 * @param cEdges
	 * @return double Normalized effective infectious
	 */
	
	private double doMixingViaCommonBorderEdges(Node node,
			StandardDiseaseModelLabel diseaseLabel, double onsiteInfectious,
			EAttribute infectiousAttribute, EAttribute mixingAttribute, EAttribute roadAttribute) {
		double infectiousChangeFromMixing = 0.0;
		double populationChangeFromMixing = 0.0;

		@SuppressWarnings("unchecked")
		List<Edge>cEdges = (List<Edge>)edgeListObjectPool.get();
		cEdges.clear();
		CommonBorderRelationshipLabelImpl.getCommonBorderEdgesFromNode(node, cEdges);
		
		for(int i=0;i<cEdges.size();++i) {
			Edge borderEdge = cEdges.get(i);
			// If it exists, we're looking for the label this disease model
			// updates on the node at the other end of the border edge.
			// sum up the changes from each connected node.
			// NOTE: some of these changes could be negative

			final Node otherNode = borderEdge.getOtherNode(node);
			double borderLength = ((CommonBorderRelationshipLabelValue) borderEdge
					.getLabel().getCurrentValue()).getBorderLength();

			if (otherNode instanceof Region) {
				double otherArea = 0.0;
				double otherInfective = 0.0;

				// Compute the the total population for all cohorts. 
				double totalPopulation = 0.0;
				EList<NodeLabel> nodeLabels = otherNode.getLabels();
				for(int j = 0; j < nodeLabels.size(); j ++) {
					NodeLabel nlabel = nodeLabels.get(j);
					if (nlabel instanceof DiseaseModelLabel && this == ((DiseaseModelLabel)nlabel).getDecorator()) {
							DiseaseModelLabel dml = (DiseaseModelLabel)nlabel;
							DiseaseModelLabelValue dmlv = (DiseaseModelLabelValue)dml.getTempValue();
							totalPopulation = totalPopulation + dmlv.getPopulationCount();
					}
				}
				
				EList<NodeLabel>labs = otherNode.getLabels();
				for(int j=0;j<labs.size();++j) {
					NodeLabel otherLabel = labs.get(j);
					if (otherLabel instanceof AreaLabel) {
						otherArea = ((AreaLabel) otherLabel)
								.getCurrentAreaValue().getArea();
					} else if (otherLabel instanceof StandardDiseaseModelLabel) {
						StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;

						if (otherDiseaseLabel.getDecorator() == this
								&& otherDiseaseLabel.getIdentifier().equals(
										diseaseLabel.getIdentifier())) {
				
							otherInfective = otherDiseaseLabel
									.getTempValue().eGetDouble(
											infectiousAttribute.getFeatureID());
						}
					}
				}

				double mixingFactor = Math.min((Double)this.eGet(mixingAttribute)
						* borderLength / otherArea, 1.0);
				
				if (otherArea == 0.0) {
					mixingFactor = 0.0;
				}

				infectiousChangeFromMixing += mixingFactor * otherInfective;
				populationChangeFromMixing += mixingFactor * totalPopulation;
			}
		} // for each border edge
		edgeListObjectPool.release(cEdges);
		
		return addMixingRoadTransportationEdges(node,
			diseaseLabel, onsiteInfectious,
			infectiousAttribute, infectiousChangeFromMixing, populationChangeFromMixing, roadAttribute);
		
		
	}

	
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValueMatrix getTransmissionRate() {
		return transmissionRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionRate(
			DoubleValueMatrix newTransmissionRate, NotificationChain msgs) {
		// DoubleValueMatrix oldTransmissionRate = transmissionRate;
		transmissionRate = newTransmissionRate;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionRate(DoubleValueMatrix newTransmissionRate) {
		if (newTransmissionRate != transmissionRate) {
			NotificationChain msgs = null;
			if (transmissionRate != null)
				msgs = ((InternalEObject)transmissionRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE, null, msgs);
			if (newTransmissionRate != null)
				msgs = ((InternalEObject)newTransmissionRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE, null, msgs);
			msgs = basicSetTransmissionRate(newTransmissionRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValueList getRecoveryRate() {
		return recoveryRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecoveryRate(
			DoubleValueList newRecoveryRate, NotificationChain msgs) {
		// DoubleValueList oldRecoveryRate = recoveryRate;
		recoveryRate = newRecoveryRate;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryRate(DoubleValueList newRecoveryRate) {
		if (newRecoveryRate != recoveryRate) {
			NotificationChain msgs = null;
			if (recoveryRate != null)
				msgs = ((InternalEObject)recoveryRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE, null, msgs);
			if (newRecoveryRate != null)
				msgs = ((InternalEObject)newRecoveryRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE, null, msgs);
			msgs = basicSetRecoveryRate(newRecoveryRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValueList getInfectiousMortalityRate() {
		return infectiousMortalityRate;
	}

	/**
	 * Get the particular infectious mortality rate for a specific population
	 * group by name
	 * 
	 * @generated NOT
	 */
	public double getInfectiousMortality(String populationName) {
		// next get it's INDEX in the model
		// TODO we should encapsulate this code in a helper method
		int populationIndex = this.getPopulationIndex(populationName);
		if (getInfectiousMortalityRate() != null)
			return getInfectiousMortalityRate().getValues()
					.get(populationIndex).getValue();
		else
			return 0.0; // default if not specified
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfectiousMortalityRate(
			DoubleValueList newInfectiousMortalityRate, NotificationChain msgs) {
		// DoubleValueList oldInfectiousMortalityRate = infectiousMortalityRate;
		infectiousMortalityRate = newInfectiousMortalityRate;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfectiousMortalityRate(
			DoubleValueList newInfectiousMortalityRate) {
		if (newInfectiousMortalityRate != infectiousMortalityRate) {
			NotificationChain msgs = null;
			if (infectiousMortalityRate != null)
				msgs = ((InternalEObject)infectiousMortalityRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE, null, msgs);
			if (newInfectiousMortalityRate != null)
				msgs = ((InternalEObject)newInfectiousMortalityRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE, null, msgs);
			msgs = basicSetInfectiousMortalityRate(newInfectiousMortalityRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueList getPopulationGroups() {
		return populationGroups;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulationGroups(
			StringValueList newPopulationGroups, NotificationChain msgs) {
		// StringValueList oldPopulationGroups = populationGroups;
		populationGroups = newPopulationGroups;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationGroups(StringValueList newPopulationGroups) {
		if (newPopulationGroups != populationGroups) {
			NotificationChain msgs = null;
			if (populationGroups != null)
				msgs = ((InternalEObject)populationGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS, null, msgs);
			if (newPopulationGroups != null)
				msgs = ((InternalEObject)newPopulationGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS, null, msgs);
			msgs = basicSetPopulationGroups(newPopulationGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS:
			return basicSetPopulationGroups(null, msgs);
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE:
			return basicSetTransmissionRate(null, msgs);
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE:
			return basicSetRecoveryRate(null, msgs);
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE:
			return basicSetInfectiousMortalityRate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS:
			return getPopulationGroups();
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE:
			return getTransmissionRate();
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE:
			return getRecoveryRate();
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE:
			return getInfectiousMortalityRate();
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
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS:
			setPopulationGroups((StringValueList)newValue);
			return;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE:
			setTransmissionRate((DoubleValueMatrix)newValue);
			return;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE:
			setRecoveryRate((DoubleValueList)newValue);
			return;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE:
			setInfectiousMortalityRate((DoubleValueList)newValue);
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
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS:
			setPopulationGroups((StringValueList)null);
			return;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE:
			setTransmissionRate((DoubleValueMatrix)null);
			return;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE:
			setRecoveryRate((DoubleValueList)null);
			return;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE:
			setInfectiousMortalityRate((DoubleValueList)null);
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
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS:
			return populationGroups != null;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE:
			return transmissionRate != null;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE:
			return recoveryRate != null;
		case MultipopulationPackage.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE:
			return infectiousMortalityRate != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public double getAdjustedInfectiousMortalityRate(long timeDelta,
			final String populationName) {
		// TODO this division can be eliminated if timeDelta==getTimePeriod
		return getInfectiousMortality(populationName)
				* ((double) timeDelta / (double) getTimePeriod());
	} // getAdjustedInfectiousMortalityRate

	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;
			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			// THIS method gets called multiple times, once for each population
			// identifier
			// in the population model.
			// which population is "this"....
			final SILabelValue currentSI = (SILabelValue) currentState;
			String thisPopulation = diseaseLabel.getPopulationModelLabel()
					.getPopulationIdentifier();

			// Compute deaths
			final double adjustedInfectiousMortalityRate = getAdjustedInfectiousMortalityRate(
					timeDelta, thisPopulation);
			final double diseaseDeaths = adjustedInfectiousMortalityRate
					* currentSI.getI();

			// next get it's INDEX in the model
			int populationIndex = getPopulationIndex(thisPopulation);

			// now we know the index of the current population being integrated.
			// Get the correct transmission rate list from the MATRIX
			EList<DoubleValue> transmissionVector = getTransmissionRate()
					.getValueLists().get(populationIndex).getValues();

			// ALL the other disease parameters are also DoubleValueLists. We now
			// iterate through all populations
			// get the specific rate parameters from EACH list based on this
			// population index
			double thisRecoveryRate = 0.0;
			if (getRecoveryRate() != null)
				thisRecoveryRate = getRecoveryRate().getValues()
				.get(populationIndex).getValue();

			// NOW iterate over every population (including this one) to compute new
			// infections
			// this includes infections within a population group
			// and all the cross terms
			double numberOfSusceptibleToInfected = 0.0;
			double numberSusceptible = currentSI.getS();
			Node thisNode = diseaseLabel.getNode();

			EList<StringValue> groupList = getPopulationGroups().getValues();

			for (int i = 0; i < transmissionVector.size(); i++) {
				// We need to get the identifier of the ith population model
				String nextPop = groupList.get(i).getValue();

				// ////////////////
				// 1. compute BETA for transmission from the ith population to this
				// population
				double specificTransmission = transmissionVector.get(i).getValue();
				double adjustedTransmission = getAdjustedTransmissionRate(
						specificTransmission, timeDelta);
				if (!this.isFrequencyDependent())
					adjustedTransmission *= getTransmissionRateScaleFactor(diseaseLabel);

				// we need to get the disease label for the ith population as well.
				// to get the on site number of infectios individuals of type i
				EList<NodeLabel> nodeLabels = thisNode.getLabels();
				for (int j = 0; j < nodeLabels.size(); j++) {
					NodeLabel nlabel = nodeLabels.get(j);
					if (nlabel instanceof SILabel) {
						if (this == ((SILabel) nlabel).getDecorator()) {
							StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) nlabel;
							// now check the popualtion type
							String otherPopulation = otherDiseaseLabel
									.getPopulationModelLabel()
									.getPopulationIdentifier();
							if (otherPopulation.equals(nextPop)) {
								// Yes?
								// then we found the label for the correct next
								// population

								// for this population we need to get the EFFECTIVE
								// Infectious including
								// ALL neighboring nodes
								double onsiteInfectious = ((SILabelValue) otherDiseaseLabel
										.getTempValue()).getI();
								final double effectiveInfectious = getNormalizedEffectiveInfectious(
										thisNode, otherDiseaseLabel,
										onsiteInfectious,
										StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

								// ADD up the new incidence
								numberOfSusceptibleToInfected += adjustedTransmission
										* numberSusceptible * effectiveInfectious;
							}
						}
					}// if it's an SI label
				}// for all labels in THIS node
			}// For all population in the model

			double numberOfInfectedToSusceptible = getAdjustedRecoveryRate(
					thisRecoveryRate, timeDelta) * currentSI.getI();

			// Determine delta S
			final double deltaS = -numberOfSusceptibleToInfected
					+ numberOfInfectedToSusceptible;
			// Determine delta I
			final double deltaI = numberOfSusceptibleToInfected
					- numberOfInfectedToSusceptible - diseaseDeaths;

			SILabelValueImpl ret = (SILabelValueImpl) deltaValue;
			
			/////////////////////////////////////////////////////////////////////////////
			// added to express the transitions. Necessary to support stochastic modeling
			// S->I
			Exchange siExchange = (Exchange)ExchangePool.POOL.get(); 
			siExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			siExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
			siExchange.setCount(numberOfSusceptibleToInfected);
			siExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
			siExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			ret.getDepartures().add(siExchange);
			
			// I->S
			Exchange isExchange = (Exchange)ExchangePool.POOL.get(); 
			isExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
			isExchange.setTarget(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			isExchange.setCount(numberOfInfectedToSusceptible);
			isExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			ret.getDepartures().add(isExchange);
			// added to express the transitions. Necessary to support stochastic modeling
			/////////////////////////////////////////////////////////////////////////////
			
			ret.setS(deltaS);
			ret.setI(deltaI);
			ret.setIncidence(numberOfSusceptibleToInfected);
			ret.setDiseaseDeaths(diseaseDeaths);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}

	}

	protected int getPopulationIndex(String thisPopulation) {
		// next get it's INDEX in the model
		// TODO we should encapsulate this code in a helper method
		int populationIndex = -1;
		EList<StringValue> groupList = getPopulationGroups().getValues();
		for (int i = 0; i < groupList.size(); i++) {
			String nextPop = groupList.get(i).getValue();
			if (nextPop.equalsIgnoreCase(thisPopulation)) {
				populationIndex = i;
				break;
			}
		}
		if (populationIndex < 0) {
			// should never happen
			Activator.logError(
					"MultiPopulationSIDiseaseModel.computeDiseaseDeltas() Error, Population named "
							+ thisPopulation + " not found. check spelling !!",
							new Exception());
		}
		return populationIndex;
	}

	/**
	 * <!-- begin-user-doc --> Returns the time interval deltaT divided by the
	 * initial time period
	 * 
	 * @param timeDelta
	 * @param specificTransmission
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public double getAdjustedTransmissionRate(double specificTransmission,
			long timeDelta) {
		return (specificTransmission * ((double) timeDelta / (double) getTimePeriod()));
	} // getAdjustedTransmissionRate

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param timeDelta
	 * 
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public double getAdjustedRecoveryRate(double specificRecoveryRate,
			long timeDelta) {
		return (specificRecoveryRate * ((double) timeDelta / (double) getTimePeriod()));
	} // getAdjustedRecoveryRate

	/**
	 * This method is used to scale the transmission rate. it returns the local
	 * density divided by a "reference" density
	 * 
	 * @param diseaseLabel
	 *            the label being processed
	 * @return the transmission rate scale factor for the label being processed
	 */
	public double getTransmissionRateScaleFactor(
			StandardDiseaseModelLabel diseaseLabel) {

		double referenceDensity = getReferencePopulationDensity();
		// assert(referenceDensity > 0);
		// need editor check so ref density always >1. Default is 100.
		assert getArea(diseaseLabel.getPopulationLabel()) > 0.0;
		double localDensity = ((StandardDiseaseModelLabelValue) diseaseLabel
				.getTempValue()).getPopulationCount()
				/ getArea(diseaseLabel.getPopulationLabel());
		return localDensity / referenceDensity;
	} // getTransmissionRateScaleFactor

	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSILabel();
	}

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(
			String populationIdentifier) {
		return StandardFactory.eINSTANCE.createSILabelValue();
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

	/**
	 * We need to override this method to return all population model labels for
	 * the population groups
	 * 
	 * @param populationIdentifier
	 *            the population being labeled
	 * @param graph
	 *            the graph to search
	 * @return the PopulationLabel instances of the graph that match the
	 *         identifier.
	 */
	@Override
	public EList<PopulationModelLabel> getPopulationModelLabels(
			String populationIdentifier, Graph graph) {
		final EList<PopulationModelLabel> retValue = new BasicEList<PopulationModelLabel>();

		// Iterate through all of the population labels in the graph
		EList<NodeLabel> labels = graph
				.getNodeLabelsByTypeURI(PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);
		for (NodeLabel pl : labels) {
			final PopulationModelLabel populationLabel = (PopulationModelLabel) pl;
			// Is this label for the population we're looking for?
			boolean keep = false;
			// if (populationLabel.getPopulationIdentifier().equals(
			// populationIdentifier)) keep = true;
			// else
			for (StringValue g : this.getPopulationGroups().getValues())
				if (g.getValue().equals(
						populationLabel.getPopulationIdentifier())) {
					keep = true;
					break;
				}

			if (keep) {
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
	} // getPopulationLabels

	/**
	 * We need to override to check all population groups
	 */

	@Override
	public void prepare(Model model, STEMTime time) {

		for (StringValue sv : this.getPopulationGroups().getValues()) {
			boolean found = findPopulationModel(model, sv.getValue());

			if (!found) {
				// Create a new standard population model
				StandardPopulationModel spm = StandardFactoryImpl.eINSTANCE
						.createStandardPopulationModel();
				spm.setPopulationIdentifier(sv.getValue());
				String title = "Auto Generated " + sv.getValue()
						+ " population model";
				String name = "auto_gen_" + sv.getValue() + "_population_model";
				spm.setURI(STEMURI.createURI(name + "/"
						+ STEMURI.generateUniquePart()));
				spm.setName(name);
				spm.getDublinCore().setTitle(title);
				model.getNodeDecorators().add(0, spm);
			}
		}
	}

	@Override
	public EList<String> getAllLabelIdentifiers() {
		EList<String> identifiers = new BasicEList<String>();
		EList<StringValue> groups = getPopulationGroups().getValues();

		for (StringValue g : groups) {
			identifiers.add(g.getValue());
		}

		return identifiers;
	}

} // MultiPopulationSIDiseaseModelImpl
