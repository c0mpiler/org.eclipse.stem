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
package org.eclipse.stem.diseasemodels.measles.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.experiment.ExperimentPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.logger.LoggerPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.predicate.PredicatePackage;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.solver.SolverPackage;
import org.eclipse.stem.core.trigger.TriggerPackage;
import org.eclipse.stem.diseasemodels.measles.Measles;
import org.eclipse.stem.diseasemodels.measles.MeaslesFactory;
import org.eclipse.stem.diseasemodels.measles.MeaslesLabel;
import org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue;
import org.eclipse.stem.diseasemodels.measles.MeaslesPackage;
import org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeaslesPackageImpl extends EPackageImpl implements MeaslesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measlesLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measlesLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measlesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeaslesPackageImpl() {
		super(eNS_URI, MeaslesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MeaslesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeaslesPackage init() {
		if (isInited) return (MeaslesPackage)EPackage.Registry.INSTANCE.getEPackage(MeaslesPackage.eNS_URI);

		// Obtain or create and register package
		MeaslesPackageImpl theMeaslesPackage = (MeaslesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeaslesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeaslesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MultipopulationPackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		ExperimentPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		PredicatePackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		TriggerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMeaslesPackage.createPackageContents();

		// Initialize created meta-data
		theMeaslesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeaslesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeaslesPackage.eNS_URI, theMeaslesPackage);
		return theMeaslesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeaslesLabel() {
		return measlesLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeaslesLabelValue() {
		return measlesLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeaslesLabelValue_Vaccinated() {
		return (EAttribute)measlesLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeaslesLabelValue_Immunisations() {
		return (EAttribute)measlesLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeaslesLabelValue_M() {
		return (EAttribute)measlesLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeaslesLabelValue_IncidenceV() {
		return (EAttribute)measlesLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasles() {
		return measlesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasles_VaccineEfficacy() {
		return (EAttribute)measlesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasles_InoculationScaling() {
		return (EAttribute)measlesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasles_PhaseShift() {
		return (EAttribute)measlesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasles_SeasonalModulation() {
		return (EAttribute)measlesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasles_SeasonalModulationPeriod() {
		return (EAttribute)measlesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasles_InoculatedImmunityRate() {
		return (EAttribute)measlesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasles_NewbornImmunityLossRate() {
		return (EAttribute)measlesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasles_TransmissionRateScaling() {
		return (EAttribute)measlesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeaslesFactory getMeaslesFactory() {
		return (MeaslesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		measlesLabelEClass = createEClass(MEASLES_LABEL);

		measlesLabelValueEClass = createEClass(MEASLES_LABEL_VALUE);
		createEAttribute(measlesLabelValueEClass, MEASLES_LABEL_VALUE__VACCINATED);
		createEAttribute(measlesLabelValueEClass, MEASLES_LABEL_VALUE__IMMUNISATIONS);
		createEAttribute(measlesLabelValueEClass, MEASLES_LABEL_VALUE__M);
		createEAttribute(measlesLabelValueEClass, MEASLES_LABEL_VALUE__INCIDENCE_V);

		measlesEClass = createEClass(MEASLES);
		createEAttribute(measlesEClass, MEASLES__VACCINE_EFFICACY);
		createEAttribute(measlesEClass, MEASLES__INOCULATION_SCALING);
		createEAttribute(measlesEClass, MEASLES__PHASE_SHIFT);
		createEAttribute(measlesEClass, MEASLES__SEASONAL_MODULATION);
		createEAttribute(measlesEClass, MEASLES__SEASONAL_MODULATION_PERIOD);
		createEAttribute(measlesEClass, MEASLES__INOCULATED_IMMUNITY_RATE);
		createEAttribute(measlesEClass, MEASLES__NEWBORN_IMMUNITY_LOSS_RATE);
		createEAttribute(measlesEClass, MEASLES__TRANSMISSION_RATE_SCALING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);
		MultipopulationPackage theMultipopulationPackage = (MultipopulationPackage)EPackage.Registry.INSTANCE.getEPackage(MultipopulationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		measlesLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		measlesLabelValueEClass.getESuperTypes().add(theStandardPackage.getSEIRLabelValue());
		measlesEClass.getESuperTypes().add(theMultipopulationPackage.getMultiPopulationSEIRDiseaseModel());

		// Initialize classes and features; add operations and parameters
		initEClass(measlesLabelEClass, MeaslesLabel.class, "MeaslesLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measlesLabelValueEClass, MeaslesLabelValue.class, "MeaslesLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeaslesLabelValue_Vaccinated(), ecorePackage.getEDouble(), "vaccinated", null, 0, 1, MeaslesLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeaslesLabelValue_Immunisations(), ecorePackage.getEDouble(), "immunisations", null, 0, 1, MeaslesLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeaslesLabelValue_M(), ecorePackage.getEDouble(), "m", null, 0, 1, MeaslesLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeaslesLabelValue_IncidenceV(), ecorePackage.getEDouble(), "incidenceV", null, 0, 1, MeaslesLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measlesEClass, Measles.class, "Measles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasles_VaccineEfficacy(), ecorePackage.getEDouble(), "vaccineEfficacy", "0.95", 0, 1, Measles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasles_InoculationScaling(), ecorePackage.getEDouble(), "inoculationScaling", "1.0", 0, 1, Measles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasles_PhaseShift(), ecorePackage.getEDouble(), "phaseShift", "0.0", 0, 1, Measles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasles_SeasonalModulation(), ecorePackage.getEDouble(), "seasonalModulation", "1.9", 0, 1, Measles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasles_SeasonalModulationPeriod(), ecorePackage.getELong(), "seasonalModulationPeriod", "31556925994", 0, 1, Measles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasles_InoculatedImmunityRate(), ecorePackage.getEDouble(), "inoculatedImmunityRate", "0.05", 0, 1, Measles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasles_NewbornImmunityLossRate(), ecorePackage.getEDouble(), "newbornImmunityLossRate", "2.7E-3", 0, 1, Measles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasles_TransmissionRateScaling(), ecorePackage.getEDouble(), "transmissionRateScaling", "1.0", 0, 1, Measles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/stem/modelgen/generated
		createGeneratedAnnotations();
		// http:///org/eclipse/stem/modelgen/metamodel
		createMetamodelAnnotations();
		// http:///org/eclipse/stem/modelgen/compartment/type
		createTypeAnnotations();
		// http:///org/eclipse/stem/modelgen/model/label
		createLabelAnnotations();
		// http:///org/eclipse/stem/modelgen/model/labelvalue
		createLabelvalueAnnotations();
		// http:///org/eclipse/stem/modelgen/model/transitions
		createTransitionsAnnotations();
		// http:///org/eclipse/stem/modelgen/model/adapters
		createAdaptersAnnotations();
		// http:///org/eclipse/stem/modelgen/modelparam/constraints
		createConstraintsAnnotations();
		// http:///org/eclipse/stem/modelgen/modelparam/messages
		createMessagesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/generated</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGeneratedAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/generated";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });			
		addAnnotation
		  (measlesLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (measlesLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getMeaslesLabelValue_Vaccinated(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });			
		addAnnotation
		  (getMeaslesLabelValue_Immunisations(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getMeaslesLabelValue_M(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });			
		addAnnotation
		  (getMeaslesLabelValue_IncidenceV(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });						
		addAnnotation
		  (measlesEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getMeasles_VaccineEfficacy(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getMeasles_InoculationScaling(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getMeasles_PhaseShift(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getMeasles_SeasonalModulation(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getMeasles_SeasonalModulationPeriod(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getMeasles_InoculatedImmunityRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getMeasles_NewbornImmunityLossRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getMeasles_TransmissionRateScaling(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/metamodel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetamodelAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/metamodel";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "uri", "platform:/resource/.stemgenerator/model/measles.metamodel"
		   });																																					
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/compartment/type</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTypeAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/compartment/type";							
		addAnnotation
		  (getMeaslesLabelValue_Immunisations(), 
		   source, 
		   new String[] {
			 "type", "Incidence"
		   });				
		addAnnotation
		  (getMeaslesLabelValue_IncidenceV(), 
		   source, 
		   new String[] {
			 "type", "Incidence"
		   });																														
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/model/label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLabelAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/model/label";												
		addAnnotation
		  (measlesEClass, 
		   source, 
		   new String[] {
			 "*", "MeaslesLabel"
		   });																												
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/model/labelvalue</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLabelvalueAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/model/labelvalue";													
		addAnnotation
		  (measlesEClass, 
		   source, 
		   new String[] {
			 "*", "MeaslesLabelValue"
		   });																											
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/model/transitions</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTransitionsAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/model/transitions";														
		addAnnotation
		  (measlesEClass, 
		   source, 
		   new String[] {
		   });																										
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/model/adapters</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAdaptersAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/model/adapters";															
		addAnnotation
		  (measlesEClass, 
		   source, 
		   new String[] {
		   });																									
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/modelparam/constraints</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintsAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/modelparam/constraints";																	
		addAnnotation
		  (getMeasles_VaccineEfficacy(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getMeasles_InoculationScaling(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getMeasles_PhaseShift(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });				
		addAnnotation
		  (getMeasles_SeasonalModulation(), 
		   source, 
		   new String[] {
			 "minValue", "1"
		   });				
		addAnnotation
		  (getMeasles_SeasonalModulationPeriod(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getMeasles_InoculatedImmunityRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getMeasles_NewbornImmunityLossRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getMeasles_TransmissionRateScaling(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/modelparam/messages</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMessagesAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/modelparam/messages";																		
		addAnnotation
		  (getMeasles_VaccineEfficacy(), 
		   source, 
		   new String[] {
			 "name", "Vaccine Efficacy",
			 "tooltip", "Vaccine Efficiacy (fractions of inoculations successful)",
			 "invalid", "Vaccine Efficiacy is invalid",
			 "missing", "Vaccine Efficiacy is missing"
		   });				
		addAnnotation
		  (getMeasles_InoculationScaling(), 
		   source, 
		   new String[] {
			 "name", "Inoculation Scaling",
			 "tooltip", "Scale the total number of incoculations performed (everywhere) using a factor",
			 "invalid", "Inoculation Scaling is invalid",
			 "missing", "Inoculation Scaling is missing"
		   });				
		addAnnotation
		  (getMeasles_PhaseShift(), 
		   source, 
		   new String[] {
			 "name", "Phase Shift",
			 "tooltip", "The phase shift for the seasonal modulation for measles",
			 "invalid", "Phase shift is invalid (must be between 0 and 1)",
			 "missing", "Phase shift is missing"
		   });				
		addAnnotation
		  (getMeasles_SeasonalModulation(), 
		   source, 
		   new String[] {
			 "name", "Seasonal Modulation",
			 "tooltip", "The seasonal modulation in the contact rate for measles",
			 "invalid", "Seasonal modulation is invalid (>1)",
			 "missing", "Seasonal modulation is missing"
		   });				
		addAnnotation
		  (getMeasles_SeasonalModulationPeriod(), 
		   source, 
		   new String[] {
			 "name", "Seasonal Modulation Period",
			 "unit", "ms",
			 "tooltip", "The period of the seasonal modulation (in ms)",
			 "invalid", "Seasonal Modulation Period is invalid (>0)",
			 "missing", "Seasonal Modulation Period is missing"
		   });				
		addAnnotation
		  (getMeasles_InoculatedImmunityRate(), 
		   source, 
		   new String[] {
			 "name", "Inoculated Immunity Rate",
			 "unit", "1/TP",
			 "tooltip", "Rate rate at which population members come immune after inoculation",
			 "invalid", "Inoculation Immunity Rate is invalid (>0)",
			 "missing", "Inoculation Immunity Rate is missing"
		   });				
		addAnnotation
		  (getMeasles_NewbornImmunityLossRate(), 
		   source, 
		   new String[] {
			 "name", "Newborn Immunity Loss Rate",
			 "unit", "1/TP",
			 "tooltip", "The immunity loss rate for new borns",
			 "invalid", "New Born Immunity Loss Rate is invalid (>1)",
			 "missing", "New Born Immunity Loss Rate is missing"
		   });				
		addAnnotation
		  (getMeasles_TransmissionRateScaling(), 
		   source, 
		   new String[] {
			 "name", "Transmission Rate Scaling",
			 "tooltip", "Scaling factor for all transmission rates",
			 "invalid", "Transmission rate scaling is invalid",
			 "missing", "Transmission rate scaling is missing"
		   });	
	}

} //MeaslesPackageImpl
