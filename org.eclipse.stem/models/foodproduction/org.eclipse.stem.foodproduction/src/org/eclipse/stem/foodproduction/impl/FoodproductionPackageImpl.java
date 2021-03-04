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
package org.eclipse.stem.foodproduction.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.logger.LoggerPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.solver.SolverPackage;
import org.eclipse.stem.foodproduction.ConsumptionType;
import org.eclipse.stem.foodproduction.DiseaseCarryingTransformer;
import org.eclipse.stem.foodproduction.FoodConsumer;
import org.eclipse.stem.foodproduction.FoodProducer;
import org.eclipse.stem.foodproduction.FoodTransformer;
import org.eclipse.stem.foodproduction.FoodproductionFactory;
import org.eclipse.stem.foodproduction.FoodproductionPackage;
import org.eclipse.stem.foodproduction.SlaughterHouse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoodproductionPackageImpl extends EPackageImpl implements FoodproductionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodProducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaughterHouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diseaseCarryingTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consumptionTypeEEnum = null;

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
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FoodproductionPackageImpl() {
		super(eNS_URI, FoodproductionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FoodproductionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FoodproductionPackage init() {
		if (isInited) return (FoodproductionPackage)EPackage.Registry.INSTANCE.getEPackage(FoodproductionPackage.eNS_URI);

		// Obtain or create and register package
		FoodproductionPackageImpl theFoodproductionPackage = (FoodproductionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FoodproductionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FoodproductionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFoodproductionPackage.createPackageContents();

		// Initialize created meta-data
		theFoodproductionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFoodproductionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FoodproductionPackage.eNS_URI, theFoodproductionPackage);
		return theFoodproductionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoodTransformer() {
		return foodTransformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodTransformer_SourcePopulationName() {
		return (EAttribute)foodTransformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodTransformer_TargetPopulationName() {
		return (EAttribute)foodTransformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodTransformer_TargetURI() {
		return (EAttribute)foodTransformerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodTransformer_TimePeriod() {
		return (EAttribute)foodTransformerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoodProducer() {
		return foodProducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodProducer_FoodYieldPopulationMultiplier() {
		return (EAttribute)foodProducerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodProducer_SourceProcessingRate() {
		return (EAttribute)foodProducerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlaughterHouse() {
		return slaughterHouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiseaseCarryingTransformer() {
		return diseaseCarryingTransformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseaseCarryingTransformer_SourceDecorator() {
		return (EReference)diseaseCarryingTransformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseaseCarryingTransformer_TargetDecorator() {
		return (EReference)diseaseCarryingTransformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseaseCarryingTransformer_StateTransitionsMap() {
		return (EReference)diseaseCarryingTransformerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseaseCarryingTransformer_SourceAttributes() {
		return (EReference)diseaseCarryingTransformerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseaseCarryingTransformer_TargetAttributes() {
		return (EReference)diseaseCarryingTransformerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoodConsumer() {
		return foodConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodConsumer_ConsumptionRate() {
		return (EAttribute)foodConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodConsumer_ConsumptionType() {
		return (EAttribute)foodConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodConsumer_WasteRate() {
		return (EAttribute)foodConsumerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodConsumer_MaxVolumeOfStocks() {
		return (EAttribute)foodConsumerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsumptionType() {
		return consumptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodproductionFactory getFoodproductionFactory() {
		return (FoodproductionFactory)getEFactoryInstance();
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
		foodTransformerEClass = createEClass(FOOD_TRANSFORMER);
		createEAttribute(foodTransformerEClass, FOOD_TRANSFORMER__SOURCE_POPULATION_NAME);
		createEAttribute(foodTransformerEClass, FOOD_TRANSFORMER__TARGET_POPULATION_NAME);
		createEAttribute(foodTransformerEClass, FOOD_TRANSFORMER__TARGET_URI);
		createEAttribute(foodTransformerEClass, FOOD_TRANSFORMER__TIME_PERIOD);

		foodProducerEClass = createEClass(FOOD_PRODUCER);
		createEAttribute(foodProducerEClass, FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER);
		createEAttribute(foodProducerEClass, FOOD_PRODUCER__SOURCE_PROCESSING_RATE);

		slaughterHouseEClass = createEClass(SLAUGHTER_HOUSE);

		diseaseCarryingTransformerEClass = createEClass(DISEASE_CARRYING_TRANSFORMER);
		createEReference(diseaseCarryingTransformerEClass, DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR);
		createEReference(diseaseCarryingTransformerEClass, DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR);
		createEReference(diseaseCarryingTransformerEClass, DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP);
		createEReference(diseaseCarryingTransformerEClass, DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES);
		createEReference(diseaseCarryingTransformerEClass, DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES);

		foodConsumerEClass = createEClass(FOOD_CONSUMER);
		createEAttribute(foodConsumerEClass, FOOD_CONSUMER__CONSUMPTION_RATE);
		createEAttribute(foodConsumerEClass, FOOD_CONSUMER__CONSUMPTION_TYPE);
		createEAttribute(foodConsumerEClass, FOOD_CONSUMER__WASTE_RATE);
		createEAttribute(foodConsumerEClass, FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS);

		// Create enums
		consumptionTypeEEnum = createEEnum(CONSUMPTION_TYPE);
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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		foodTransformerEClass.getESuperTypes().add(theModelPackage.getTransformationDecorator());
		foodProducerEClass.getESuperTypes().add(this.getFoodTransformer());
		slaughterHouseEClass.getESuperTypes().add(this.getFoodProducer());
		slaughterHouseEClass.getESuperTypes().add(this.getDiseaseCarryingTransformer());
		foodConsumerEClass.getESuperTypes().add(this.getFoodTransformer());
		foodConsumerEClass.getESuperTypes().add(this.getDiseaseCarryingTransformer());

		// Initialize classes and features; add operations and parameters
		initEClass(foodTransformerEClass, FoodTransformer.class, "FoodTransformer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFoodTransformer_SourcePopulationName(), theEcorePackage.getEString(), "sourcePopulationName", "cattle", 0, 1, FoodTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodTransformer_TargetPopulationName(), theEcorePackage.getEString(), "targetPopulationName", "beef", 0, 1, FoodTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodTransformer_TargetURI(), theCommonPackage.getURI(), "targetURI", null, 0, 1, FoodTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodTransformer_TimePeriod(), theEcorePackage.getELong(), "timePeriod", "86400000", 0, 1, FoodTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foodProducerEClass, FoodProducer.class, "FoodProducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFoodProducer_FoodYieldPopulationMultiplier(), theEcorePackage.getEDouble(), "foodYieldPopulationMultiplier", "100", 0, 1, FoodProducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodProducer_SourceProcessingRate(), theEcorePackage.getEDouble(), "sourceProcessingRate", "1.0", 0, 1, FoodProducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slaughterHouseEClass, SlaughterHouse.class, "SlaughterHouse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diseaseCarryingTransformerEClass, DiseaseCarryingTransformer.class, "DiseaseCarryingTransformer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiseaseCarryingTransformer_SourceDecorator(), theModelPackage.getIntegrationDecorator(), null, "sourceDecorator", null, 0, 1, DiseaseCarryingTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiseaseCarryingTransformer_TargetDecorator(), theModelPackage.getIntegrationDecorator(), null, "targetDecorator", null, 0, 1, DiseaseCarryingTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiseaseCarryingTransformer_StateTransitionsMap(), theCommonPackage.getDoubleValueMatrix(), null, "stateTransitionsMap", null, 0, 1, DiseaseCarryingTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiseaseCarryingTransformer_SourceAttributes(), theEcorePackage.getEAttribute(), null, "sourceAttributes", null, 0, -1, DiseaseCarryingTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiseaseCarryingTransformer_TargetAttributes(), theEcorePackage.getEAttribute(), null, "targetAttributes", null, 0, -1, DiseaseCarryingTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foodConsumerEClass, FoodConsumer.class, "FoodConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFoodConsumer_ConsumptionRate(), theEcorePackage.getEDouble(), "consumptionRate", "0.1", 0, 1, FoodConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodConsumer_ConsumptionType(), this.getConsumptionType(), "consumptionType", "1", 0, 1, FoodConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodConsumer_WasteRate(), theEcorePackage.getEDouble(), "wasteRate", "0.0", 0, 1, FoodConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodConsumer_MaxVolumeOfStocks(), theEcorePackage.getEDouble(), "maxVolumeOfStocks", "1000000", 0, 1, FoodConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(consumptionTypeEEnum, ConsumptionType.class, "ConsumptionType");
		addEEnumLiteral(consumptionTypeEEnum, ConsumptionType.RELATIVE_CONSUMPTION);
		addEEnumLiteral(consumptionTypeEEnum, ConsumptionType.ABSOLUTE_CONSUMPTION);
		addEEnumLiteral(consumptionTypeEEnum, ConsumptionType.CONSUMPTION_PER_PERSON);

		// Create resource
		createResource(eNS_URI);
	}

} //FoodproductionPackageImpl
