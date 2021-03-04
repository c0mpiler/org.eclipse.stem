package org.eclipse.stem.diseasemodels.avianinfluenza.impl;

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
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaFactory;
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9Label;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9LabelValue;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvianinfluenzaPackageImpl extends EPackageImpl implements AvianinfluenzaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h7N9LabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h7N9LabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h7N9EClass = null;

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
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AvianinfluenzaPackageImpl() {
		super(eNS_URI, AvianinfluenzaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AvianinfluenzaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AvianinfluenzaPackage init() {
		if (isInited) return (AvianinfluenzaPackage)EPackage.Registry.INSTANCE.getEPackage(AvianinfluenzaPackage.eNS_URI);

		// Obtain or create and register package
		AvianinfluenzaPackageImpl theAvianinfluenzaPackage = (AvianinfluenzaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AvianinfluenzaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AvianinfluenzaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		ExperimentPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		PredicatePackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		TriggerPackage.eINSTANCE.eClass();
		DiseasepredicatesPackage.eINSTANCE.eClass();
		VectorPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAvianinfluenzaPackage.createPackageContents();

		// Initialize created meta-data
		theAvianinfluenzaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAvianinfluenzaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AvianinfluenzaPackage.eNS_URI, theAvianinfluenzaPackage);
		return theAvianinfluenzaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH7N9Label() {
		return h7N9LabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH7N9LabelValue() {
		return h7N9LabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH7N9() {
		return h7N9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH7N9_AvianToAvianTransmissionRate() {
		return (EAttribute)h7N9EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH7N9_AvianRecoveryRate() {
		return (EAttribute)h7N9EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH7N9_AvianToHumanTransmissionRate() {
		return (EAttribute)h7N9EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH7N9_HumanToHumanTransmissionRate() {
		return (EAttribute)h7N9EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH7N9_AvianCharacteristicMixingDistance() {
		return (EAttribute)h7N9EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH7N9_HumanRecoveryRate() {
		return (EAttribute)h7N9EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH7N9_HumanImmunityLossRate() {
		return (EAttribute)h7N9EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH7N9_TemperatureFactor() {
		return (EAttribute)h7N9EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvianinfluenzaFactory getAvianinfluenzaFactory() {
		return (AvianinfluenzaFactory)getEFactoryInstance();
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
		h7N9LabelEClass = createEClass(H7N9_LABEL);

		h7N9LabelValueEClass = createEClass(H7N9_LABEL_VALUE);

		h7N9EClass = createEClass(H7N9);
		createEAttribute(h7N9EClass, H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE);
		createEAttribute(h7N9EClass, H7N9__AVIAN_RECOVERY_RATE);
		createEAttribute(h7N9EClass, H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE);
		createEAttribute(h7N9EClass, H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE);
		createEAttribute(h7N9EClass, H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE);
		createEAttribute(h7N9EClass, H7N9__HUMAN_RECOVERY_RATE);
		createEAttribute(h7N9EClass, H7N9__HUMAN_IMMUNITY_LOSS_RATE);
		createEAttribute(h7N9EClass, H7N9__TEMPERATURE_FACTOR);
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
		VectorPackage theVectorPackage = (VectorPackage)EPackage.Registry.INSTANCE.getEPackage(VectorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		h7N9LabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		h7N9LabelValueEClass.getESuperTypes().add(theStandardPackage.getSIRLabelValue());
		h7N9EClass.getESuperTypes().add(theVectorPackage.getVectorDiseaseModel());

		// Initialize classes and features; add operations and parameters
		initEClass(h7N9LabelEClass, H7N9Label.class, "H7N9Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(h7N9LabelValueEClass, H7N9LabelValue.class, "H7N9LabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(h7N9EClass, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, "H7N9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH7N9_AvianToAvianTransmissionRate(), ecorePackage.getEDouble(), "avianToAvianTransmissionRate", "0.1", 0, 1, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH7N9_AvianRecoveryRate(), ecorePackage.getEDouble(), "avianRecoveryRate", "0.0", 0, 1, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH7N9_AvianToHumanTransmissionRate(), ecorePackage.getEDouble(), "avianToHumanTransmissionRate", "1.2", 0, 1, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH7N9_HumanToHumanTransmissionRate(), ecorePackage.getEDouble(), "humanToHumanTransmissionRate", "1.2", 0, 1, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH7N9_AvianCharacteristicMixingDistance(), ecorePackage.getEDouble(), "avianCharacteristicMixingDistance", "0.5", 0, 1, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH7N9_HumanRecoveryRate(), ecorePackage.getEDouble(), "humanRecoveryRate", "0.5", 0, 1, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH7N9_HumanImmunityLossRate(), ecorePackage.getEDouble(), "humanImmunityLossRate", "0.001", 0, 1, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH7N9_TemperatureFactor(), ecorePackage.getEDouble(), "temperatureFactor", "1.0", 0, 1, org.eclipse.stem.diseasemodels.avianinfluenza.H7N9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/stem/modelgen/generated
		createGeneratedAnnotations();
		// http:///org/eclipse/stem/modelgen/metamodel
		createMetamodelAnnotations();
		// http:///org/eclipse/stem/modelgen/model/label
		createLabelAnnotations();
		// http:///org/eclipse/stem/modelgen/model/labelvalue
		createLabelvalueAnnotations();
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
		  (h7N9LabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (h7N9LabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });					
		addAnnotation
		  (h7N9EClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getH7N9_AvianToAvianTransmissionRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getH7N9_AvianRecoveryRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getH7N9_AvianToHumanTransmissionRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getH7N9_HumanToHumanTransmissionRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getH7N9_AvianCharacteristicMixingDistance(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getH7N9_HumanRecoveryRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getH7N9_HumanImmunityLossRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getH7N9_TemperatureFactor(), 
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
			 "uri", "platform:/resource/.stemgenerator/model/avianinfluenza.metamodel"
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
		  (h7N9EClass, 
		   source, 
		   new String[] {
			 "*", "H7N9Label"
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
		  (h7N9EClass, 
		   source, 
		   new String[] {
			 "*", "H7N9LabelValue"
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
		  (h7N9EClass, 
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
		  (getH7N9_AvianToAvianTransmissionRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getH7N9_AvianRecoveryRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getH7N9_AvianToHumanTransmissionRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getH7N9_HumanToHumanTransmissionRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getH7N9_AvianCharacteristicMixingDistance(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getH7N9_HumanRecoveryRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getH7N9_HumanImmunityLossRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getH7N9_TemperatureFactor(), 
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
		  (getH7N9_AvianToAvianTransmissionRate(), 
		   source, 
		   new String[] {
			 "name", "Avian To Avian Transmission Rate"
		   });				
		addAnnotation
		  (getH7N9_AvianRecoveryRate(), 
		   source, 
		   new String[] {
			 "name", "Avian Recovery Rate"
		   });				
		addAnnotation
		  (getH7N9_AvianToHumanTransmissionRate(), 
		   source, 
		   new String[] {
			 "name", "Avian To Human Transmission Rate"
		   });				
		addAnnotation
		  (getH7N9_HumanToHumanTransmissionRate(), 
		   source, 
		   new String[] {
			 "name", "Human To Human Transmission Rate"
		   });				
		addAnnotation
		  (getH7N9_AvianCharacteristicMixingDistance(), 
		   source, 
		   new String[] {
			 "name", "Avian Characteristic Mixing Distance"
		   });				
		addAnnotation
		  (getH7N9_HumanRecoveryRate(), 
		   source, 
		   new String[] {
			 "name", "Human Recovery Rate"
		   });				
		addAnnotation
		  (getH7N9_HumanImmunityLossRate(), 
		   source, 
		   new String[] {
			 "name", "Human Immunity Loss Rate"
		   });				
		addAnnotation
		  (getH7N9_TemperatureFactor(), 
		   source, 
		   new String[] {
			 "name", "Temperature Factor"
		   });	
	}

} //AvianinfluenzaPackageImpl
