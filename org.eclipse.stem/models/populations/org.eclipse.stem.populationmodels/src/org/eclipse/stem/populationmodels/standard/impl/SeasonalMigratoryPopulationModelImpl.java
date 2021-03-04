/**
 */
package org.eclipse.stem.populationmodels.standard.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.populationmodels.Activator;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.SeasonalMigratoryPopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seasonal Migratory Population Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.SeasonalMigratoryPopulationModelImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.SeasonalMigratoryPopulationModelImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeasonalMigratoryPopulationModelImpl extends StandardPopulationModelImpl implements SeasonalMigratoryPopulationModel {
	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected double phase = PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 365.25;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected double period = PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SeasonalMigratoryPopulationModelImpl() {
		super();
	}
	
	
	/**
	 * 
	 * @param label
	 * @param arrivals
	 * @param departures
	 * @param timeDelta
	 * @param idelta
	 * @param timeInCycles
	 */
	@Override
	protected void handleMigration(IntegrationLabel label, EList<Exchange>arrivals,EList<Exchange>departures, long timeDelta, IntegrationLabelValue idelta, double timeInCycles) {
		double modulation = Math.sin(2.0*Math.PI*(timeInCycles+this.getPhase())/this.getPeriod());
		
		Node n = (Node)label.getIdentifiable();
		StandardPopulationModelLabelValue delta = (StandardPopulationModelLabelValue)idelta;
		// double totalRemoved = 0.0; // Keeps track of the total number removed from the node. We use it to display an error when more people are removed than available.
		
		EList<Edge> edges = n.getEdges();
		for(int i=0;i<edges.size();++i) {
			Edge e = edges.get(i);
			if(e instanceof MigrationEdge) {
				MigrationEdge me = (MigrationEdge)e;
				if(!me.getPopulationIdentifier().equals(this.getPopulationIdentifier())) continue;
				
				// Migration is FROM A TO B
				Node source  = me.getA();
				Node dest = me.getB();
						
				// rate can now be positive or negative
				// we only care when it is positive
				double rate = modulation*me.getLabel().getCurrentValue().getMigrationRate();
				if(modulation < 0.0) {
					source = me.getB();
					dest = me.getA();
					rate = -1.0*rate;
				}
				
				boolean leaving = source.equals(n);
				
				long timeperiod = me.getLabel().getCurrentValue().getTimePeriod();
				if(leaving) {
					StandardPopulationModelLabelValue val = ((StandardPopulationModelLabelValue) label.getTempValue()); // Must be temp value to ensure destination labels gets the same result
					double count = val.getCount();
					double goodbye; // rescale and adjust
					
					if (me.isUseAbsoluteValues()) {
						// rate is absolute
						goodbye = rate*(double)timeDelta/(double)timeperiod;
					} else {
						// rate is relative (fraction of whole population)
						goodbye = count*rate*(double)timeDelta/(double)timeperiod;
					}
					
					delta.setCount(delta.getCount()-goodbye);
					
					// totalRemoved += goodbye;
					Exchange migrationExchange = (Exchange)ExchangePool.POOL.get(); // released later?
					Label otherLabel = null;
					
					EList<NodeLabel>destLabels = dest.getLabels();
					for(int j=0;j<destLabels.size();++j) {
						Label lab = destLabels.get(j);
						if (lab instanceof StandardPopulationModelLabel && ((StandardPopulationModelLabel)lab).getPopulationIdentifier().equals(((PopulationModelLabel)label).getPopulationIdentifier())) {
							otherLabel = lab;
							break;
						}
					}
					
					if(otherLabel == null) {
						
						Activator.logError(NLS.bind(Messages.EDGE_POP_MODEL_MISSING, new Object[] {dest.getURI().toString(), ((PopulationModelLabel)label).getPopulationIdentifier()}), new Exception());
						return;
					}
					
					migrationExchange.setType(ExchangeType.MIGRATION);
					migrationExchange.getOtherLabels().add(otherLabel);
					migrationExchange.setCount(goodbye);
					delta.getDepartures().add(migrationExchange);
				} else {
					// Find the population model label on the dest node
					StandardPopulationModelLabelValue otherVal = null;
					Label otherLabel = null;
					EList<NodeLabel>sourceLabels = source.getLabels();
					for(int j=0;j<sourceLabels.size();++j) {
						NodeLabel lab = sourceLabels.get(j);
						if(lab instanceof StandardPopulationModelLabel && ((PopulationModelLabel)lab).getPopulationIdentifier().equals(((PopulationModelLabel)label).getPopulationIdentifier())) {
							otherVal = (StandardPopulationModelLabelValue)((StandardPopulationModelLabel)lab).getTempValue();
							otherLabel = lab;
							break;
						}
					}
					if(otherVal == null) {
						Activator.logError(NLS.bind(Messages.EDGE_POP_MODEL_MISSING, new Object[] {dest.getURI().toString(), ((PopulationModelLabel)label).getPopulationIdentifier()}), new Exception());
						return;
					}
					double count = otherVal.getCount();
					double welcome; // rescale and adjust
					
					if (me.isUseAbsoluteValues()) {
						// rate is absolute
						welcome = rate*(double)timeDelta/(double)timeperiod;
					} else {
						// rate is relative (fraction of whole population)
						welcome = count*rate*(double)timeDelta/(double)timeperiod;
					}
					
					delta.setCount(delta.getCount()+welcome);
					
					Exchange migrationExchange = (Exchange)ExchangePool.POOL.get();
					
					migrationExchange.setType(ExchangeType.MIGRATION);
					migrationExchange.getOtherLabels().add(otherLabel);
					migrationExchange.setCount(welcome);
					delta.getArrivals().add(migrationExchange);
				}
			} // Migration edge
		} // For each edge
		// 04/11/2012 Commented out: This is not an error. It can happen in many cases,
		// for example if the time step is huge or if the MigrationEdge has an absolute Value 
		//		StandardPopulationModelLabelValue val = ((StandardPopulationModelLabelValue) label.getTempValue()); 
		//		if(val.getCount() - totalRemoved < 0.0) 
		//		Activator.logError(NLS.bind(Messages.MIGRATION_EXCEEDS_AVAILABLE_POPULATION, new Object[] {label.getIdentifiable().getURI(), label.getPopulationIdentifier(), Double.valueOf(totalRemoved), Double.valueOf(val.getCount())}), new Exception());
	
	}// handleMigration
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SEASONAL_MIGRATORY_POPULATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(double newPhase) {
		phase = newPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.SEASONAL_MIGRATORY_POPULATION_MODEL__PHASE:
				return getPhase();
			case StandardPackage.SEASONAL_MIGRATORY_POPULATION_MODEL__PERIOD:
				return getPeriod();
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
			case StandardPackage.SEASONAL_MIGRATORY_POPULATION_MODEL__PHASE:
				setPhase((Double)newValue);
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
			case StandardPackage.SEASONAL_MIGRATORY_POPULATION_MODEL__PHASE:
				setPhase(PHASE_EDEFAULT);
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
			case StandardPackage.SEASONAL_MIGRATORY_POPULATION_MODEL__PHASE:
				return phase != PHASE_EDEFAULT;
			case StandardPackage.SEASONAL_MIGRATORY_POPULATION_MODEL__PERIOD:
				return period != PERIOD_EDEFAULT;
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
		result.append(" (phase: ");
		result.append(phase);
		result.append(", period: ");
		result.append(period);
		result.append(')');
		return result.toString();
	}

} //SeasonalMigratoryPopulationModelImpl
