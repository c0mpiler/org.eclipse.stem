/**
 */
package org.eclipse.stem.interventions.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.graphgenerators.Activator;
import org.eclipse.stem.graphgenerators.impl.GraphGeneratorImpl;
import org.eclipse.stem.interventions.InterventionsFactory;
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.PeriodicControlGraphGenerator;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Control Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl#getPopulationIdentifier <em>Population Identifier</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl#isUseVaccinations <em>Use Vaccinations</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl#isFraction <em>Fraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodicControlGraphGeneratorImpl extends GraphGeneratorImpl implements PeriodicControlGraphGenerator {
	
	/** 
	 * Control graph type
	 */
	public static final String CONTROL_GRAPH_TYPE="Control Graph";

	/**
	 * The URI segment used to identify it as an intervention label
	 */
	
	public static final String INTERVENTION_LABEL_URI_SEGMENT = "intervention";

	
	
	/**
	 * The default value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_IDENTIFIER_EDEFAULT = "human";

	/**
	 * The cached value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String populationIdentifier = POPULATION_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected String dataPath = DATA_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long PERIOD_EDEFAULT = 86400000L;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected long period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseVaccinations() <em>Use Vaccinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseVaccinations()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_VACCINATIONS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseVaccinations() <em>Use Vaccinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseVaccinations()
	 * @generated
	 * @ordered
	 */
	protected boolean useVaccinations = USE_VACCINATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFraction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRACTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFraction()
	 * @generated
	 * @ordered
	 */
	protected boolean fraction = FRACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PeriodicControlGraphGeneratorImpl() {
		super();
	}
	
	
	/**
	 * Generate control labels
	 * 
	 * @generated NOT
	 */
	
	@Override
	public Graph getGraph() {
		final Graph graph = GraphFactory.eINSTANCE.createGraph();
		try {
			final DublinCore dc = graph.getDublinCore();
			dc.populate();
			dc.setTitle(CONTROL_GRAPH_TYPE);
			dc.setSource(this.getClass().getSimpleName());
			Calendar c = Calendar.getInstance();
	        SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	        String valid = formatter.format(c.getTime());
	       	dc.setValid(valid);
	       	
	       	
	       	String file = this.getDataPath();
	       	
	       	BufferedReader fw = new BufferedReader(new FileReader(file));
	       	
	       	
	       	// Get the headers.
	       	String locationStr = fw.readLine();
	       	
	       	String [] locations = locationStr.split(",");
	       	
	       	
	       	for(int i=0;i<locations.length;++i) {
	       		StandardInterventionLabel scl = InterventionsFactory.eINSTANCE.createStandardInterventionLabel();
	   	 		scl.setURIOfIdentifiableToBeLabeled(RegionImpl.createRegionNodeURI(locations[i]));
	   	 		scl.setPopulationIdentifier(this.getPopulationIdentifier());
	   	 		
	   	 		StandardPeriodicInterventionLabelValue currentValue = InterventionsFactory.eINSTANCE.createStandardPeriodicInterventionLabelValue();
		 		
	   	 		currentValue.setPeriod(this.getPeriod());
	   	 		currentValue.setAbsolute(!this.isFraction());
	   	 		scl.setCurrentValue(currentValue);
	   	 		
	   	 		scl.setURI(STEMURI.createURI(INTERVENTION_LABEL_URI_SEGMENT+"/"+locations[i]));
	   	 		
	   	 		graph.putNodeLabel(scl);
	       	}
	       	
	       	String dataLine = fw.readLine();
	       	
	       	while(dataLine != null) {
	       		String [] sData = dataLine.split(",");
	       		double [] data = new double[sData.length];
	       		for(int i=0;i<data.length;++i) { 			
	       			data[i]=Double.parseDouble(sData[i]);
	       			URI intURI = STEMURI.createURI(INTERVENTION_LABEL_URI_SEGMENT+"/"+locations[i]);
	       			StandardInterventionLabel sil = (StandardInterventionLabel)graph.getNodeLabel(intURI);
	       			StandardPeriodicInterventionLabelValue spilv = (StandardPeriodicInterventionLabelValue)sil.getCurrentValue();
	       			if(isUseVaccinations())
	       				spilv.getVaccinations().add(data[i]);
	       			else spilv.getIsolations().add(data[i]);
	       		}
	       		
	       		dataLine = fw.readLine();
	       		
	       	}
	       	
	       	fw.close();
	       	
	        assert graph.sane();
		} catch(IOException ioe) {
			Activator.logError(ioe.getMessage(), ioe);
		}
		return graph;

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterventionsPackage.Literals.PERIODIC_CONTROL_GRAPH_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulationIdentifier() {
		return populationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationIdentifier(String newPopulationIdentifier) {
		String oldPopulationIdentifier = populationIdentifier;
		populationIdentifier = newPopulationIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER, oldPopulationIdentifier, populationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataPath() {
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPath(String newDataPath) {
		String oldDataPath = dataPath;
		dataPath = newDataPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH, oldDataPath, dataPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPeriod() {
		return period;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(long newPeriod) {
		long oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD, oldPeriod, period));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseVaccinations() {
		return useVaccinations;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseVaccinations(boolean newUseVaccinations) {
		boolean oldUseVaccinations = useVaccinations;
		useVaccinations = newUseVaccinations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS, oldUseVaccinations, useVaccinations));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFraction() {
		return fraction;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFraction(boolean newFraction) {
		boolean oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION, oldFraction, fraction));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
				return getPopulationIdentifier();
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH:
				return getDataPath();
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD:
				return getPeriod();
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS:
				return isUseVaccinations();
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION:
				return isFraction();
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
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
				setPopulationIdentifier((String)newValue);
				return;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH:
				setDataPath((String)newValue);
				return;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD:
				setPeriod((Long)newValue);
				return;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS:
				setUseVaccinations((Boolean)newValue);
				return;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION:
				setFraction((Boolean)newValue);
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
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
				setPopulationIdentifier(POPULATION_IDENTIFIER_EDEFAULT);
				return;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
				return;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS:
				setUseVaccinations(USE_VACCINATIONS_EDEFAULT);
				return;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION:
				setFraction(FRACTION_EDEFAULT);
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
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
				return POPULATION_IDENTIFIER_EDEFAULT == null ? populationIdentifier != null : !POPULATION_IDENTIFIER_EDEFAULT.equals(populationIdentifier);
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD:
				return period != PERIOD_EDEFAULT;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS:
				return useVaccinations != USE_VACCINATIONS_EDEFAULT;
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION:
				return fraction != FRACTION_EDEFAULT;
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
		result.append(" (populationIdentifier: ");
		result.append(populationIdentifier);
		result.append(", dataPath: ");
		result.append(dataPath);
		result.append(", period: ");
		result.append(period);
		result.append(", useVaccinations: ");
		result.append(useVaccinations);
		result.append(", fraction: ");
		result.append(fraction);
		result.append(')');
		return result.toString();
	}

} //PeriodicControlGraphGeneratorImpl
