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
package org.eclipse.stem.diseasemodels.veterinary.impl;

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

import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage;

import org.eclipse.stem.diseasemodels.standard.StandardPackage;

import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits;
import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabel;
import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabelValue;
import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease;
import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabel;
import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabelValue;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryFactory;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VeterinaryPackageImpl extends EPackageImpl implements VeterinaryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleVeterinaryDiseaseLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleVeterinaryDiseaseLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleVeterinaryDiseaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contaminatedUnitsLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contaminatedUnitsLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contaminatedUnitsEClass = null;

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
	 * @see org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VeterinaryPackageImpl() {
		super(eNS_URI, VeterinaryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VeterinaryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VeterinaryPackage init() {
		if (isInited) return (VeterinaryPackage)EPackage.Registry.INSTANCE.getEPackage(VeterinaryPackage.eNS_URI);

		// Obtain or create and register package
		VeterinaryPackageImpl theVeterinaryPackage = (VeterinaryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VeterinaryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VeterinaryPackageImpl());

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
		StandardPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVeterinaryPackage.createPackageContents();

		// Initialize created meta-data
		theVeterinaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVeterinaryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VeterinaryPackage.eNS_URI, theVeterinaryPackage);
		return theVeterinaryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleVeterinaryDiseaseLabel() {
		return simpleVeterinaryDiseaseLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleVeterinaryDiseaseLabelValue() {
		return simpleVeterinaryDiseaseLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleVeterinaryDisease() {
		return simpleVeterinaryDiseaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleVeterinaryDisease_EnvironmentalTransmissionRate() {
		return (EAttribute)simpleVeterinaryDiseaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContaminatedUnitsLabel() {
		return contaminatedUnitsLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContaminatedUnitsLabelValue() {
		return contaminatedUnitsLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContaminatedUnits() {
		return contaminatedUnitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContaminatedUnits_DissapationRate() {
		return (EAttribute)contaminatedUnitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContaminatedUnits_SheddingFactor() {
		return (EAttribute)contaminatedUnitsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VeterinaryFactory getVeterinaryFactory() {
		return (VeterinaryFactory)getEFactoryInstance();
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
		simpleVeterinaryDiseaseLabelEClass = createEClass(SIMPLE_VETERINARY_DISEASE_LABEL);

		simpleVeterinaryDiseaseLabelValueEClass = createEClass(SIMPLE_VETERINARY_DISEASE_LABEL_VALUE);

		simpleVeterinaryDiseaseEClass = createEClass(SIMPLE_VETERINARY_DISEASE);
		createEAttribute(simpleVeterinaryDiseaseEClass, SIMPLE_VETERINARY_DISEASE__ENVIRONMENTAL_TRANSMISSION_RATE);

		contaminatedUnitsLabelEClass = createEClass(CONTAMINATED_UNITS_LABEL);

		contaminatedUnitsLabelValueEClass = createEClass(CONTAMINATED_UNITS_LABEL_VALUE);

		contaminatedUnitsEClass = createEClass(CONTAMINATED_UNITS);
		createEAttribute(contaminatedUnitsEClass, CONTAMINATED_UNITS__DISSAPATION_RATE);
		createEAttribute(contaminatedUnitsEClass, CONTAMINATED_UNITS__SHEDDING_FACTOR);
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
		org.eclipse.stem.populationmodels.standard.StandardPackage theStandardPackage_1 = (org.eclipse.stem.populationmodels.standard.StandardPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.stem.populationmodels.standard.StandardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleVeterinaryDiseaseLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		simpleVeterinaryDiseaseLabelValueEClass.getESuperTypes().add(theStandardPackage.getSILabelValue());
		simpleVeterinaryDiseaseEClass.getESuperTypes().add(theStandardPackage.getSI());
		contaminatedUnitsLabelEClass.getESuperTypes().add(theStandardPackage_1.getStandardPopulationModelLabel());
		contaminatedUnitsLabelValueEClass.getESuperTypes().add(theStandardPackage_1.getStandardPopulationModelLabelValue());
		contaminatedUnitsEClass.getESuperTypes().add(theStandardPackage_1.getPopulationModel());

		// Initialize classes and features; add operations and parameters
		initEClass(simpleVeterinaryDiseaseLabelEClass, SimpleVeterinaryDiseaseLabel.class, "SimpleVeterinaryDiseaseLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleVeterinaryDiseaseLabelValueEClass, SimpleVeterinaryDiseaseLabelValue.class, "SimpleVeterinaryDiseaseLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleVeterinaryDiseaseEClass, SimpleVeterinaryDisease.class, "SimpleVeterinaryDisease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleVeterinaryDisease_EnvironmentalTransmissionRate(), ecorePackage.getEDouble(), "environmentalTransmissionRate", "0.0", 0, 1, SimpleVeterinaryDisease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contaminatedUnitsLabelEClass, ContaminatedUnitsLabel.class, "ContaminatedUnitsLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contaminatedUnitsLabelValueEClass, ContaminatedUnitsLabelValue.class, "ContaminatedUnitsLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contaminatedUnitsEClass, ContaminatedUnits.class, "ContaminatedUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContaminatedUnits_DissapationRate(), ecorePackage.getEDouble(), "dissapationRate", "0.0", 0, 1, ContaminatedUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContaminatedUnits_SheddingFactor(), ecorePackage.getEDouble(), "sheddingFactor", "0.0", 0, 1, ContaminatedUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (simpleVeterinaryDiseaseLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (simpleVeterinaryDiseaseLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });					
		addAnnotation
		  (simpleVeterinaryDiseaseEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getSimpleVeterinaryDisease_EnvironmentalTransmissionRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (contaminatedUnitsLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (contaminatedUnitsLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });					
		addAnnotation
		  (contaminatedUnitsEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getContaminatedUnits_DissapationRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getContaminatedUnits_SheddingFactor(), 
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
			 "uri", "platform:/resource/.stemgenerator/model/veterinary.metamodel"
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
		  (simpleVeterinaryDiseaseEClass, 
		   source, 
		   new String[] {
			 "*", "SimpleVeterinaryDiseaseLabel"
		   });										
		addAnnotation
		  (contaminatedUnitsEClass, 
		   source, 
		   new String[] {
			 "*", "ContaminatedUnitsLabel"
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
		  (simpleVeterinaryDiseaseEClass, 
		   source, 
		   new String[] {
			 "*", "SimpleVeterinaryDiseaseLabelValue"
		   });										
		addAnnotation
		  (contaminatedUnitsEClass, 
		   source, 
		   new String[] {
			 "*", "ContaminatedUnitsLabelValue"
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
		  (simpleVeterinaryDiseaseEClass, 
		   source, 
		   new String[] {
			 "propertyEditorSuperClass", "org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor",
			 "stringProviderSuperClass", "org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter",
			 "labelRelativeValueProviderSuperClass", "org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider",
			 "labelValueRelativeValueProviderSuperClass", "org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider"
		   });										
		addAnnotation
		  (contaminatedUnitsEClass, 
		   source, 
		   new String[] {
			 "propertyEditorSuperClass", "org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditor",
			 "stringProviderSuperClass", "org.eclipse.stem.ui.populationmodels.standard.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter",
			 "labelRelativeValueProviderSuperClass", "org.eclipse.stem.ui.populationmodels.adapters.StandardRelativeValueProviderAdapterFactory.StandardPopulationModelLabelRelativeValueProvider",
			 "labelValueRelativeValueProviderSuperClass", "org.eclipse.stem.ui.populationmodels.adapters.StandardRelativeValueProviderAdapterFactory.PopulationModelLabelValueRelativeValueProvider"
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
		  (getSimpleVeterinaryDisease_EnvironmentalTransmissionRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });										
		addAnnotation
		  (getContaminatedUnits_DissapationRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });				
		addAnnotation
		  (getContaminatedUnits_SheddingFactor(), 
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
		  (getSimpleVeterinaryDisease_EnvironmentalTransmissionRate(), 
		   source, 
		   new String[] {
			 "name", "Environmental Transmission Rate"
		   });										
		addAnnotation
		  (getContaminatedUnits_DissapationRate(), 
		   source, 
		   new String[] {
			 "name", "Dissapation Rate"
		   });				
		addAnnotation
		  (getContaminatedUnits_SheddingFactor(), 
		   source, 
		   new String[] {
			 "name", "Shedding Factor"
		   });	
	}

} //VeterinaryPackageImpl
