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
package org.eclipse.stem.evolvingcrossspeciesmodel.impl;

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
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelFactory;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolvingCrossSpeciesModelPackageImpl extends EPackageImpl implements EvolvingCrossSpeciesModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingCrossSpeciesModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingCrossSpeciesModelLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingCrossSpeciesModelEClass = null;

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
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvolvingCrossSpeciesModelPackageImpl() {
		super(eNS_URI, EvolvingCrossSpeciesModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvolvingCrossSpeciesModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvolvingCrossSpeciesModelPackage init() {
		if (isInited) return (EvolvingCrossSpeciesModelPackage)EPackage.Registry.INSTANCE.getEPackage(EvolvingCrossSpeciesModelPackage.eNS_URI);

		// Obtain or create and register package
		EvolvingCrossSpeciesModelPackageImpl theEvolvingCrossSpeciesModelPackage = (EvolvingCrossSpeciesModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvolvingCrossSpeciesModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvolvingCrossSpeciesModelPackageImpl());

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
		EvolvingPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEvolvingCrossSpeciesModelPackage.createPackageContents();

		// Initialize created meta-data
		theEvolvingCrossSpeciesModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvolvingCrossSpeciesModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvolvingCrossSpeciesModelPackage.eNS_URI, theEvolvingCrossSpeciesModelPackage);
		return theEvolvingCrossSpeciesModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingCrossSpeciesModelLabel() {
		return evolvingCrossSpeciesModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingCrossSpeciesModelLabelValue() {
		return evolvingCrossSpeciesModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModelLabelValue_E() {
		return (EAttribute)evolvingCrossSpeciesModelLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModelLabelValue_Seff() {
		return (EAttribute)evolvingCrossSpeciesModelLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingCrossSpeciesModel() {
		return evolvingCrossSpeciesModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModel_OtherToOtherTransmissionRate() {
		return (EAttribute)evolvingCrossSpeciesModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModel_OtherRecoveryRate() {
		return (EAttribute)evolvingCrossSpeciesModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModel_OtherToHostTransmissionRate() {
		return (EAttribute)evolvingCrossSpeciesModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModel_TemperatureFactor() {
		return (EAttribute)evolvingCrossSpeciesModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModel_OtherPopulationIdentifier() {
		return (EAttribute)evolvingCrossSpeciesModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModel_OtherImmunityLossRate() {
		return (EAttribute)evolvingCrossSpeciesModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingCrossSpeciesModel_IncubationRate() {
		return (EAttribute)evolvingCrossSpeciesModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModelFactory getEvolvingCrossSpeciesModelFactory() {
		return (EvolvingCrossSpeciesModelFactory)getEFactoryInstance();
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
		evolvingCrossSpeciesModelLabelEClass = createEClass(EVOLVING_CROSS_SPECIES_MODEL_LABEL);

		evolvingCrossSpeciesModelLabelValueEClass = createEClass(EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE);
		createEAttribute(evolvingCrossSpeciesModelLabelValueEClass, EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E);
		createEAttribute(evolvingCrossSpeciesModelLabelValueEClass, EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF);

		evolvingCrossSpeciesModelEClass = createEClass(EVOLVING_CROSS_SPECIES_MODEL);
		createEAttribute(evolvingCrossSpeciesModelEClass, EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE);
		createEAttribute(evolvingCrossSpeciesModelEClass, EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE);
		createEAttribute(evolvingCrossSpeciesModelEClass, EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE);
		createEAttribute(evolvingCrossSpeciesModelEClass, EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR);
		createEAttribute(evolvingCrossSpeciesModelEClass, EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER);
		createEAttribute(evolvingCrossSpeciesModelEClass, EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE);
		createEAttribute(evolvingCrossSpeciesModelEClass, EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE);
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
		EvolvingPackage theEvolvingPackage = (EvolvingPackage)EPackage.Registry.INSTANCE.getEPackage(EvolvingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evolvingCrossSpeciesModelLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		evolvingCrossSpeciesModelLabelValueEClass.getESuperTypes().add(theStandardPackage.getSIRLabelValue());
		evolvingCrossSpeciesModelEClass.getESuperTypes().add(theEvolvingPackage.getEvolvingSIRDiseaseModel());

		// Initialize classes and features; add operations and parameters
		initEClass(evolvingCrossSpeciesModelLabelEClass, EvolvingCrossSpeciesModelLabel.class, "EvolvingCrossSpeciesModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evolvingCrossSpeciesModelLabelValueEClass, EvolvingCrossSpeciesModelLabelValue.class, "EvolvingCrossSpeciesModelLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvolvingCrossSpeciesModelLabelValue_E(), ecorePackage.getEDouble(), "e", null, 0, 1, EvolvingCrossSpeciesModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingCrossSpeciesModelLabelValue_Seff(), ecorePackage.getEDouble(), "seff", null, 0, 1, EvolvingCrossSpeciesModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evolvingCrossSpeciesModelEClass, EvolvingCrossSpeciesModel.class, "EvolvingCrossSpeciesModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvolvingCrossSpeciesModel_OtherToOtherTransmissionRate(), ecorePackage.getEDouble(), "otherToOtherTransmissionRate", "0.0", 0, 1, EvolvingCrossSpeciesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingCrossSpeciesModel_OtherRecoveryRate(), ecorePackage.getEDouble(), "otherRecoveryRate", "0.1", 0, 1, EvolvingCrossSpeciesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingCrossSpeciesModel_OtherToHostTransmissionRate(), ecorePackage.getEDouble(), "otherToHostTransmissionRate", "0.0", 0, 1, EvolvingCrossSpeciesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingCrossSpeciesModel_TemperatureFactor(), ecorePackage.getEDouble(), "temperatureFactor", "20.0", 0, 1, EvolvingCrossSpeciesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingCrossSpeciesModel_OtherPopulationIdentifier(), ecorePackage.getEString(), "otherPopulationIdentifier", "avian", 0, 1, EvolvingCrossSpeciesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingCrossSpeciesModel_OtherImmunityLossRate(), ecorePackage.getEDouble(), "otherImmunityLossRate", "0.001", 0, 1, EvolvingCrossSpeciesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingCrossSpeciesModel_IncubationRate(), ecorePackage.getEDouble(), "incubationRate", "1.0", 0, 1, EvolvingCrossSpeciesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (evolvingCrossSpeciesModelLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingCrossSpeciesModelLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModelLabelValue_E(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModelLabelValue_Seff(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingCrossSpeciesModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherToOtherTransmissionRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherRecoveryRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherToHostTransmissionRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_TemperatureFactor(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherPopulationIdentifier(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherImmunityLossRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_IncubationRate(), 
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
			 "uri", "platform:/resource/.stemgenerator/model/evolvingcrossspeciesmodel.metamodel"
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
		  (evolvingCrossSpeciesModelEClass, 
		   source, 
		   new String[] {
			 "*", "EvolvingCrossSpeciesModelLabel"
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
		  (evolvingCrossSpeciesModelEClass, 
		   source, 
		   new String[] {
			 "*", "EvolvingCrossSpeciesModelLabelValue"
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
		  (evolvingCrossSpeciesModelEClass, 
		   source, 
		   new String[] {
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
		  (getEvolvingCrossSpeciesModel_OtherToOtherTransmissionRate(), 
		   source, 
		   new String[] {
			 "name", "Other To Other Transmission Rate"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherRecoveryRate(), 
		   source, 
		   new String[] {
			 "name", "Other Recovery Rate"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherToHostTransmissionRate(), 
		   source, 
		   new String[] {
			 "name", "Other To Host Transmission Rate"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_TemperatureFactor(), 
		   source, 
		   new String[] {
			 "name", "Temperature Factor"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherPopulationIdentifier(), 
		   source, 
		   new String[] {
			 "name", "Other Population Identifier"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_OtherImmunityLossRate(), 
		   source, 
		   new String[] {
			 "name", "Other Immunity Loss Rate"
		   });	
		addAnnotation
		  (getEvolvingCrossSpeciesModel_IncubationRate(), 
		   source, 
		   new String[] {
			 "name", "Incubation Rate"
		   });
	}

} //EvolvingCrossSpeciesModelPackageImpl
